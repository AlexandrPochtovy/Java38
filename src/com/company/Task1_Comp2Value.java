package com.company;
/*
* Напишите консольную программу, в которой пользователь с клавиатуры вводит два числа.
* А программа сранивает два введенных числа и выводит на консоль результат сравнения
* (два числа равны, первое число больше второго или первое число меньше второго).
* */
import java.util.Scanner;

public class Task1_Comp2Value {
    public static void main (String [] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value a = ");
        a = sc.nextInt();
        System.out.print("Enter value b = ");
        b = sc.nextInt();
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
    }
}
