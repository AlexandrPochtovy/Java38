package com.company;
/*
* В цикле программа просит у пользователя ввести два числа и выводит результат их умножения.
После вывода результата умножения программа спрашивает, надо ли завершить выполнение.
* И если пользователь введет число 1, то программа завершает цикл.
* Если введено любое другое число, то программа продолжает спрашивать у пользователя два числа и умножать их.
* */
import java.util.Scanner;

public class Task6_InfiniteMul {
    public static void main (String [] args) throws InterruptedException {
        int a;
        int b;
        String key2 = "";
        boolean chk = true;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a = ");
            a = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter b = ");
            b = sc.nextInt();
            sc.nextLine();
            System.out.println("a * b = " + (a * b));
            System.out.print("Enter 1 for exit or press any key for resume ");
            key2 = sc.nextLine();
            chk = key2.compareTo("1") != 0;
        } while (chk);
    }
}
