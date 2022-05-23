package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*
	* в цикле программа просит у пользователя два числа, выводит произведение
	* после спрашивает надо ли выйти, если нажато 1 то выход, продолжение - любая другая клавиша
	* сделал также защиту от ввода мусора и повторный запрос ввода на каждую переменную
    */
        String strA = new String("Enter value a ");
        String strB = new String("Enter value b ");
        String strRes = new String("Multiplication result = ");
        String mask = new String("1");
        String req = new String("For exit press " + mask + ", for repeat press any key ");
        int a = 0;
        int b = 0;
        int c = 0;
        String exitCom;
    Scanner sc = new Scanner(System.in);
    do {
        int step = 1;
        do {
            try {
                System.out.print(strA);
                a = sc.nextInt();
                step = 0;
            } catch (InputMismatchException e) {
                System.out.println("Enter NUMBERS!!!");
                sc.nextLine();
            }
        } while (step == 1);

        step = 1;
        do {
            try {
                System.out.print(strB);
                b = sc.nextInt();
                step = 0;
            } catch (InputMismatchException e) {
                System.out.println("Enter NUMBERS!!!");
                sc.nextLine();
            }
        } while (step == 1);

        /*System.out.print(strB);
        try {
            b = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Enter NUMBERS!!!");
            sc.nextLine();
        }
        finally {
            b = 1;
        }*/
        c = a * b;
        System.out.print(strRes);
        System.out.println(c);
        System.out.print(req);
        sc.nextLine();
        exitCom = sc.nextLine();
    } while (exitCom.equals(mask) == false);
        sc.close();
    }
}
