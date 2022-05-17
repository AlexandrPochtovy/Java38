package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
	// initial Lesson 13 class branch
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            fileReader = new FileReader("file.txt");
            fileWriter = new FileWriter("out2.txt");
            int a;
            while ((a = fileReader.read()) != -1) {
                fileWriter.append((char)a);
                System.out.print((char)a);
            }
            fileReader.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
