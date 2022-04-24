package com.company;
/*
* Перепишите логические выражение из задания выше, с помощью конструкции switch/case
* и выведите в консоль значение переменной (до 3 значений)
 * */
import java.util.Scanner;

public class LogicSwitch {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        for (int i = 0; i < 12; i++) {
            switch (i) {
                case 0 -> {// x меньше или равно 10 и не равно 5
                    System.out.print("Check 1: (x <= 10) && (x != 5) Enter x = ");
                    x = sc.nextInt();
                    if ((x <= 10) && (x != 5)) {
                        switch(x){
                            case -2:
                                System.out.println("число равно -2");
                                break;
                            case 4:
                                System.out.println("число равно 4");
                                break;
                            case 1:
                                System.out.println("число равно 1");
                                break;
                            default:
                                System.out.println("число соответствует правилу");
                                break;
                        }
                    } else {
                        System.out.println("Число не подходит");
                    }
                }
                case 1 -> {// х больше 20 и меньше 5 и равно 15
                    System.out.print("Check 2: (x == 15) && (x > 20) && (x < 5) Enter x = ");
                    x = sc.nextInt();
                    if ((x == 15) && (x > 20) && (x < 5)) {
                        switch(x){
                            case 15:
                                System.out.println("число равно 15");
                                break;
                            case 21:
                                System.out.println("число равно 21");
                                break;
                            case 4:
                                System.out.println("число равно 4");
                                break;
                            default:
                                System.out.println("число соответствует правилу");
                                break;
                        }
                    } else {
                        System.out.println("Число не подходит");
                    }
                }
                case 2 -> {// х не входит в промежуток от -5 до -15 и больше 40
                    System.out.print("Check 3: (!(x >= -15) && (x <= -5)) && (x > 40) Enter x = ");
                    x = sc.nextInt();
                    if ((!(x >= -15) && (x <= -5)) && (x > 40)) {
                        switch(x){
                            case 16:
                                System.out.println("число равно 16");
                                break;
                            case -7:
                                System.out.println("число равно -7");
                                break;
                            case 0:
                                System.out.println("число равно 0");
                                break;
                            default:
                                System.out.println("число соответствует правилу");
                                break;
                        }
                    } else {
                        System.out.println("Число не подходит");
                    }
                }
                case 3 -> {// x больше или равно -10 и меньше 15 и не равно 8
                    System.out.print("Check 4: (x >= -10) && (x < 15) && (x != 8) Enter x = ");
                    x = sc.nextInt();
                    if ((x >= -10) && (x < 15) && (x != 8)) {
                        switch(x){
                            case -9:
                                System.out.println("число равно -9");
                                break;
                            case 14:
                                System.out.println("число равно 14");
                                break;
                            case 11:
                                System.out.println("число равно 11");
                                break;
                            default:
                                System.out.println("число соответствует правилу");
                                break;
                        }
                    } else {
                        System.out.println("Число не подходит");
                    }
                }
                case 4 -> {// х не входит в промежуток от 0 до -15 и не равно 40
                    System.out.print("Check 5: (!(x >= -15) && (x <= 0)) && (x != 40) Enter x = ");
                    x = sc.nextInt();
                    if ((!(x >= -15) && (x <= 0)) && (x != 40)) {
                        switch(x){
                            case -22:
                                System.out.println("число равно -22");
                                break;
                            case 42:
                                System.out.println("число равно 42");
                                break;
                            case 17:
                                System.out.println("число равно 17");
                                break;
                            default:
                                System.out.println("число соответствует правилу");
                                break;
                        }
                    } else {
                        System.out.println("Число не подходит");
                    }
                }
                case 5 -> {// x меньше 5 и не равно 3
                    System.out.print("Check 6: (x < 5) && (x != 3) Enter x = ");
                    x = sc.nextInt();
                    if ((x < 5) && (x != 3)) {
                        switch(x){
                            case 2:
                                System.out.println("число равно 2");
                                break;
                            case 1:
                                System.out.println("число равно 1");
                                break;
                            case -10:
                                System.out.println("число равно -10");
                                break;
                            default:
                                System.out.println("число соответствует правилу");
                                break;
                        }
                    } else {
                        System.out.println("Число не подходит");
                    }
                }
                case 6 -> {// x больше или равно 0 и не равно 15
                    System.out.print("Check 7: (x >= 0) && (x != 15) Enter x = ");
                    x = sc.nextInt();
                    if ((x >= 0) && (x != 15)) {
                        switch(x){
                            case 7:
                                System.out.println("число равно 7");
                                break;
                            case 2:
                                System.out.println("число равно 2");
                                break;
                            case 11:
                                System.out.println("число равно 11");
                                break;
                            default:
                                System.out.println("число соответствует правилу");
                                break;
                        }
                    } else {
                        System.out.println("Число не подходит");
                    }
                }
                case 7 -> {// х равно 15 или входит в промежуток от 20 до 100
                    System.out.print("Check 8: (x == 15) || ((x >= 20) && (x <= 100)) Enter x = ");
                    x = sc.nextInt();
                    if ((x == 15) || ((x >= 20) && (x <= 100))) {
                        switch(x){
                            case 15:
                                System.out.println("число равно 15");
                                break;
                            case 20:
                                System.out.println("число равно 20");
                                break;
                            case 100:
                                System.out.println("число равно 100");
                                break;
                            default:
                                System.out.println("число соответствует правилу");
                                break;
                        }
                    } else {
                        System.out.println("Число не подходит");
                    }
                }
                case 8 -> {// х входит в промежуток от -5 до -15 и больше 10
                    System.out.print("Check 9: (x > 10) && ((x >= -15) && (x <= -5)) Enter x = ");
                    x = sc.nextInt();
                    if ((x > 10) && ((x >= -15) && (x <= -5))) {
                        switch(x){
                            case 11:
                                System.out.println("число равно 11");
                                break;
                            case -14:
                                System.out.println("число равно -14");
                                break;
                            case 2:
                                System.out.println("число равно 2");
                                break;
                            default:
                                System.out.println("число соответствует правилу");
                                break;
                        }
                    } else {
                        System.out.println("Число не подходит");
                    }
                }
                case 9 -> {// x меньше или равно -10 и больше 15 и не равно 8
                    System.out.print("Check 10: (x <= -10) && (x > 15) && (x != 8) Enter x = ");
                    x = sc.nextInt();
                    if ((x <= -10) && (x > 15) && (x != 8)) {
                        switch(x){
                            case -22:
                                System.out.println("число равно -22");
                                break;
                            case 141:
                                System.out.println("число равно 141");
                                break;
                            case 31:
                                System.out.println("число равно 31");
                                break;
                            default:
                                System.out.println("число соответствует правилу");
                                break;
                        }
                    } else {
                        System.out.println("Число не подходит");
                    }
                }
                case 10 -> {// х входит в промежуток от 0 до 20 и не равно 10
                    System.out.print("Check 11: ((x >= 0) && (x <= 20)) && (x != 10) Enter x = ");
                    x = sc.nextInt();
                    if (((x >= 0) && (x <= 20)) && (x != 10)) {
                        switch(x){
                            case 0:
                                System.out.println("число равно 0");
                                break;
                            case 19:
                                System.out.println("число равно 19");
                                break;
                            case 9:
                                System.out.println("число равно 9");
                                break;
                            default:
                                System.out.println("число соответствует правилу");
                                break;
                        }
                    } else {
                        System.out.println("Число не подходит");
                    }
                }
                case 11 -> {//  x меньше -15 и не равно 3 или равно -10
                    System.out.print("Check 12: (x <= -15) && (x != 3) || (x == -10) Enter x = ");
                    x = sc.nextInt();
                    if ((x <= -15) && (x != 3) || (x == -10)) {
                        switch(x){
                            case -20:
                                System.out.println("число равно -20");
                                break;
                            case -10:
                                System.out.println("число равно -10");
                                break;
                            case 11:
                                System.out.println("число равно 11");
                                break;
                            default:
                                System.out.println("число соответствует правилу");
                                break;
                        }
                    } else {
                        System.out.println("Число не подходит");
                    }
                }
                default -> {
                }
            }
        }
    }
}
