package com.company;

import java.util.Scanner;
public class TwoString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Задайте первую строку");
        String st1 = sc.nextLine();
        System.out.println("Задайте вторую строку");
        String st2 = sc.nextLine();
        sc.close();
        if (StrCompare(st1, st2)) {
            System.out.println("Последние 5 символов совпадают");
        } else {
            System.out.println("Последние 5 символов НЕ совпадают");
        }
        String strOut = strOut = (FoundYa(st1, "Я") & FoundYa(st2, "Я")) ?
                                    "символ Я существует в обоих строках" :
                                    "символ Я не существует в обоих строках";
        System.out.println(strOut);
    }

    public static boolean StrCompare(String s1, String s2) {
        if ((s1.length() < 5) | (s2.length() < 5)) {
            return false;
        }
        else {
            int len1 = s1.length();
            int len2 = s2.length();
            String str1Temp = s1.substring(len1-5);
            String str2Temp = s2.substring(len2-5);
            System.out.println("Подстрока 1 ".concat(str1Temp));
            System.out.println("Подстрока 2 ".concat(str2Temp));
            return str1Temp.equals(str2Temp) == true;
        }
    }

    public static boolean StrCompareCase(String s1, String s2) {
        if ((s1.length() < 5) | (s2.length() < 5)) {
            return false;
        }
        else {
            int len1 = s1.length();
            int len2 = s2.length();
            String str1Temp = s1.substring(len1-5);
            String str2Temp = s2.substring(len2-5);
            System.out.println("Подстрока 1 ".concat(str1Temp));
            System.out.println("Подстрока 2 ".concat(str2Temp));
            return str1Temp.equalsIgnoreCase(str2Temp) == true;
        }
    }

    public static boolean FoundYa(String str, final String ch) {
        return str.endsWith(ch);
    }
}
