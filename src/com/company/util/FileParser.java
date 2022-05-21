package com.company.util;

import com.company.exception.FileCheckException;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class FileParser {

   public static FileInputStream FileCheckOpen(String patch) throws FileCheckException {
       try {
           return new FileInputStream(patch);
       } catch (IOException e) {
           throw new FileCheckException("file: ".concat(patch).concat(" not found!"));
       }
   }

    public static ArrayList<String> ListParser(String patch) {
        FileInputStream fileInputStream = null;
        ArrayList<String> listDataString = new ArrayList<String>();//массив строк с данными
        try {//пробуем открыть файл и обработать его, здесь работает парсер файла по строкам
            fileInputStream = FileCheckOpen(patch);
            StringBuilder str = new StringBuilder();
            int a;
            while ((a = fileInputStream.read()) != -1) {
                str.append((char)a);
                if ((char)a == '\n') {
                    listDataString.add(String.valueOf(str));
                    str = new StringBuilder();
                }
            }
            return listDataString;
        }
        /* открыть файл не удалось, перехватываем системное исключение и генерируем свое
        * со своим сообщением об отсутствии файла */
        catch (FileCheckException e) {
            System.out.printf(e.getMessage());
        }
        finally {//завершаем работу, закрываем файл, возвращаем результат - массив строк
            try {//пытаемся закрыть файл
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {
                return listDataString;
            }
        }
    }

    public static String[] StringParser(String data) {
        return data.replaceAll("[\\W]", " ").split(" ");
    }
}
