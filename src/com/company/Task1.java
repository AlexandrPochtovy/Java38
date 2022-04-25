package com.company;

public class Task1 {

    public static void main(String[] args) {
	// main branch
        String[] str = {"Я", "java", "изучаю"};
        String first = "Я изучаю java";
        String sec = "скоро стану программистом";
        System.out.println(StrAdd(str));
        System.out.println(StrCon(str));
        System.out.println(StrJoin(str));
        String strFirst = Character.toString(FirstLetter(first));
        String strSec = new String(SecStr(sec));
        System.out.println(strFirst.concat(" ").concat(strSec));
    }
    public static String StrAdd(String[] data) {
        return data[0] + " " + data[2] + " " + data[1];
    }
    public static String StrCon(String[] data) {
        String str = new String();
        str =  data[0].concat(" ").concat(data[2]).concat(" ").concat(data[1]);
        return str;
    }
    public static String StrJoin (String[] data) {
        String str = data[1];
        data[1] = data[2];
        data[2] = str;
        str = String.join(" ", data);
        return str;
    }
    public static char FirstLetter(String data) {
        return data.charAt(0);
    }
    public static char[] SecStr(String data) {
        char res[] = new char[18];;
       data.getChars(6, 24, res, 0);
        return res;
    }
}
