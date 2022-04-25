package com.company;

public class BuilderCheck {
    public static void main(String[] args) {
        StringBuffer str1 = new StringBuffer("25 + 40 = 65");
        System.out.println(str1);
        ReplaceString1(str1, '=', "равно");
        //ReplaceString2(str1, '=', "равно");
        System.out.println(str1);

    }

    public static void ReplaceString1(StringBuffer source, final char remChar, final String addStr) {
        for (int i = 0; i < source.length(); i++) {
            if (source.charAt(i) == remChar) {
                source.deleteCharAt(i);
                source.insert(i, addStr);
                break;
            }
        }
    }

    public static void ReplaceString2(StringBuffer source, final char remChar, final String addStr) {
        for (int i = 0; i < source.length(); i++) {
            if (source.charAt(i) == remChar) {
                source.replace(i, i + 1, addStr);
                break;
            }
        }
    }
}
