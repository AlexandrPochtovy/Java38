package com.company.util;

import com.company.exceptions.FileCheckException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class FileParser {

   /*public static void FileCheck(String patch) throws FileCheckException {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(patch);
        } catch (FileCheckException e) {
            e.printStackTrace();
        }
    }*/

    public static ArrayList<String> ListParser(String patch) throws FileCheckException {
        FileInputStream fileInputStream = null;
        ArrayList<String> listDataString = new ArrayList<String>();//массив строк с данными
        try {//пробуем открыть файл и обработать его, здесь работает парсер файла по строкам
            fileInputStream = new FileInputStream(patch);
            StringBuilder str = new StringBuilder();
            int a;
            while ((a = fileInputStream.read()) != -1) {
                str.append((char)a);
                if ((char)a == '\n') {
                    listDataString.add(String.valueOf(str));
                    str = new StringBuilder();
                }
            }
        }
        /* открыть файл не удалось, перехватываем системное исключение и генерируем свое
        * со своим сообщением об отсутствии файла */
        catch (IOException e) {
            throw new FileCheckException("file: ".concat(patch).concat(" not found!"));
            //e.printStackTrace();
        }
        finally {//завершаем работу, закрываем файл, возвращаем результат - массив строк
            try {//пытаемся закрыть файл
                fileInputStream.close();
                return listDataString;
            } catch (IOException e) {
                throw new FileCheckException("can't close file: ".concat(patch));
            }
        }
    }

    public static String[] StringParser(String data) {
        return data.replaceAll("[\\W]", " ").split(" ");
    }
}
