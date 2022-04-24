package com.company;
/*
* Перепишите логические выражение из задания выше, с помощью конструкции if else
* и выведите в консоль значение переменной,
 * */
public class LogicIfElse {
    public static void main (String [] args) {
        int x;
        for (int i = 0; i < 12; i++) {
            switch (i) {
                case 0 -> {// x меньше или равно 10 и не равно 5
                    x  = 6;
                    System.out.print("Check 1: (x <= 10) && (x != 5) | ");
                    if ((x <= 10) && (x != 5)) {
                        System.out.println(x);
                    } else {
                        System.out.println("not check");
                    }
                }
                case 1 -> {// х больше 20 и меньше 5 и равно 15
                    x = 13;
                    System.out.print("Check 2: (x == 15) && (x > 20) && (x < 5) | ");
                    if ((x == 15) && (x > 20) && (x < 5)) {
                    System.out.println(x);
                    } else {
                        System.out.println("not check");
                    }
                }
                case 2 -> {// х не входит в промежуток от -5 до -15 и больше 40
                    x = 41;
                    System.out.print("Check 3: (!(x >= -15) && (x <= -5)) && (x > 40) | ");
                    if ((!(x >= -15) && (x <= -5)) && (x > 40)) {
                    System.out.println(x);
                    } else {
                        System.out.println("not check");
                    }
                }
                case 3 -> {// x больше или равно -10 и меньше 15 и не равно 8
                    x = 7;
                    System.out.print("Check 4: (x >= -10) && (x < 15) && (x != 8) | ");
                    if ((x >= -10) && (x < 15) && (x != 8)) {
                    System.out.println(x);
                    } else {
                        System.out.println("not check");
                    }
                }
                case 4 -> {// х не входит в промежуток от 0 до -15 и не равно 40
                    x = -2;
                    System.out.print("Check 5: (!(x >= -15) && (x <= 0)) && (x != 40) | ");
                    if ((!(x >= -15) && (x <= 0)) && (x != 40)) {
                    System.out.println(x);
                    } else {
                        System.out.println("not check");
                    }
                }
                case 5 -> {// x меньше 5 и не равно 3
                    x = 2;
                    System.out.print("Check 6: (x < 5) && (x != 3) | ");
                    if ((x < 5) && (x != 3)) {
                    System.out.println(x);
                    } else {
                        System.out.println("not check");
                    }
                }
                case 6 -> {// x больше или равно 0 и не равно 15
                    x = 7;
                    System.out.print("Check 7: (x >= 0) && (x != 15) | ");
                    if ((x >= 0) && (x != 15)) {
                    System.out.println(x);
                    } else {
                        System.out.println("not check");
                    }
                }
                case 7 -> {// х равно 15 или входит в промежуток от 20 до 100
                    x = 16;
                    System.out.print("Check 8: (x == 15) || ((x >= 20) && (x <= 100)) | ");
                    if ((x == 15) || ((x >= 20) && (x <= 100))) {
                        System.out.println(x);
                    } else {
                        System.out.println("not check");
                    }
                }
                case 8 -> {// х входит в промежуток от -5 до -15 и больше 10
                    x = 2;
                    System.out.print("Check 9: (x > 10) && ((x >= -15) && (x <= -5)) | ");
                    if ((x > 10) && ((x >= -15) && (x <= -5))) {
                    System.out.println(x);
                    } else {
                        System.out.println("not check");
                    }
                }
                case 9 -> {// x меньше или равно -10 и больше 15 и не равно 8
                    x = 2;
                    System.out.print("Check 10: (x <= -10) && (x > 15) && (x != 8) | ");
                    if ((x <= -10) && (x > 15) && (x != 8)) {
                    System.out.println(x);
                    } else {
                        System.out.println("not check");
                    }
                }
                case 10 -> {// х входит в промежуток от 0 до 20 и не равно 10
                    x =9;
                    System.out.print("Check 11: ((x >= 0) && (x <= 20)) && (x != 10) | ");
                    if (((x >= 0) && (x <= 20)) && (x != 10)) {
                    System.out.println(x);
                    } else {
                        System.out.println("not check");
                    }
                }
                case 11 -> {//  x меньше -15 и не равно 3 или равно -10
                    x = 4;
                    System.out.print("Check 12: (x <= -15) && (x != 3) || (x == -10) ");
                    if ((x <= -15) && (x != 3) || (x == -10)) {
                    System.out.println(x);
                    } else {
                        System.out.println("not check");
                    }
                }
                default -> {
                }
            }
        }
    }
}
