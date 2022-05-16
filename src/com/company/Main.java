package com.company;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	// initial Lesson 11 class branch
        try {
            FileInputStream fileInputStream = new FileInputStream("file.txt");
            int a;
            String name = "";
            while ((a = fileInputStream.read()) != -1) {
                name += (char)a;
            }

            System.out.println(name);
            String[] m = name.split("\n");
            for (String step : m) {
                String[] nik = step.split(" ");
                System.out.println("имя ".concat(nik[0]));
            }
            //System.out.println("имя ".concat(m[0]));
            //System.out.println("фамилия ".concat(m[1]));


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
