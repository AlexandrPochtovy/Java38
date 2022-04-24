package com.company;
/*Напишите программу, которая выводит на консоль таблицу умножения*/
public class Task5_TableMul {
    public static void main (String [] args) {
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
            System.out.println();
        }
    }
}
