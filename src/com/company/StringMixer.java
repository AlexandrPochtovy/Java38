package com.company;

import java.util.Scanner;

public class StringMixer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Задайте строку");
        String st1 = sc.nextLine();
        sc.close();
        System.out.println(SpaceDeleter(st1));
        System.out.println(WordsCalc(st1));
        CharRepeatCalc(st1);
        System.out.println(StringReverse(st1));

        StringBuffer st2 = new StringBuffer();
        st2.append("gatwesdasdfw");
        System.out.println(StringReverse(st2));

        StringBuilder st3 = new StringBuilder();
        st3.append("asggtrqwsadfafdsg");
        System.out.println(StringReverse(st3));

    }

    public static String SpaceDeleter(String str) {//удаляет пробелы из строки+
        return str.replace(" ", "");
    }

    public static void CharRepeatCalc(String str) {
        /*добавить проверку повторения опорных символов
        * т.е. добавить проход от 0 до текущей позиции на проверку повторного поиска символов
        * и если есть повторный поиск то переходим на следующий внешний цикл
        *
        * еще вариант сразу из строки создать массив char'ов и организовать поиск по нему, но это
        * все равно не помогает избежать двойного поиска
        * как вариант можно искать через регулярные выражения, но пока не понимаю как это организовать
        * */
        char actLetter;
        int len = str.length();
        int count;
        for (int i = 0; i < len; i++) {
            count = 0;
            actLetter = str.charAt(i);
            for (int j = i; j < len; j++) {
                if (actLetter == str.charAt(j)) {
                    ++count;
                }
            }
            if (count > 1) {
                String strMem = new String("Символ ");
                strMem = strMem.concat(Character.toString(actLetter).concat(" повторяется "));
                strMem = strMem.concat(Integer.toString(count)).concat(" раз");
                System.out.println(strMem);
            }
        }
    }

    /*не знаю как сделать защиту от нескольких пробелов подряд или пробелов в начале/конце строки
    * возможно надо сделать поиск пробелов в строке через регулярные выражения:
    * найти подстроки состоящие из пробелов и посчитать их количество
    * или через рекурсивный поиск пробелов, если после пробела идет не пробел, то это слово, если идет пробел,
    * то вызываем рекурсивный поиск еще раз и так до конца строки
    * */
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
        for (int i = dataString.length()-1; i >= 0; i--) {
            char ch = dataString.charAt(i);
            str = str.concat(Character.toString(ch));
        }
        return str;
    }
    public static StringBuffer StringReverse(StringBuffer dataString) {
        int len = dataString.length();
        StringBuffer str  = new StringBuffer(len);
        for (int i = 0; i < len; i++) {
            str.insert(i, dataString.charAt(len-i-1));
        }
        return str;
    }
    public static StringBuilder StringReverse(StringBuilder dataString) {
        int len = dataString.length();
        StringBuilder str  = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            str.insert(i, dataString.charAt(len-i-1));
        }
        return str;
    }

}
