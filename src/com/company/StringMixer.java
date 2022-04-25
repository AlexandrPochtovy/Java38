package com.company;

import java.util.Scanner;

public class StringMixer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Задайте строку");
        String st1 = sc.nextLine();
        //System.out.println(SpaceDeleter(st1));
        System.out.println(WordsCalc(st1));
    }

    public static String SpaceDeleter(String str) {//удаляет пробелы из строки+
        return str.replace(" ", "");
    }

    /*найти повторяющиеся символы
    пока непонятно что делать с этими символами
    и куда их деть
     */
    public static String CharRepeatCalc(String str) {
        return "TODO";
    }

    //не знаю как сделать защиту от нескольких пробелов подряд или пробелов в начале/конце строки
    public static int WordsCalc(String str) {//подсчитать количество слов в строке
        int count = 0;
        final char ch = ' ' ;
        int len = str.length();
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ch) {
                ++count;
            }
        }
        return count+1;
    }

    public static String StringReverse(String dataString) {
        String str = new String();
        for (int i = dataString.length()-1; i > 0; i--) {
            char ch = dataString.charAt(i);

        }
    }

}
