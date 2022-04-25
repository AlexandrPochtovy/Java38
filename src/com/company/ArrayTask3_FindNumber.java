package com.company;

import java.util.Scanner;

public class ArrayTask3_FindNumber {
    public static void main(String[] args) {
        int begin;//begin search
        int end;//end search
        System.out.println("Set begin ");
        Scanner sc = new Scanner(System.in);
        begin = sc.nextInt();
        System.out.println("Set end ");
        end = sc.nextInt();
        sc.close();
        for (int i = begin; i <=end ; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
