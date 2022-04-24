package com.company;
/*
Задано вещественное значение аргумента x. Вычислите значение функции y и выведите на экран.
y = x * (x + 452) + --x;	x = 9; x = 13; x = 22;
y = (x + x2 ) * ++x + 10 ;	x = 9; x = 13; x = 22;
y = (x2 - x2 ) * 0.8 - x++;	x = 9; x = 13; x = 22;
y = x2 / (x2 * 0.5) + x--;	x = 9; x = 13; x = 22;
y = x4 / (0.5 - 40) - x++;	x = 9; x = 13; x = 22;
y = x3 / 4 * --x + 4.0;	x = 9; x = 13; x = 22;
y = x /( x - 632) - --x;	x = 18; x = 0.5; x = 1;
y = (x2 - x) * 10 + x--;	x = 15; x = 9; x = 30;
y = (x3 - x) * 0.12 / ++x;	x = 17; x = 9; x = 1;
y = x3 / (x2 - 0.8) * x++;	x = 8; x = 12; x = 16;
y = x3 * 0.5 + 3.0 * x++;	x = 13; x = 16; x = 19;
y = x2 * (4 + 0.58) / --x;	x = 8; x = 12; x = 5;
* */
public class Somecalc2 {
    public static void main (String [] args) {
        float[][] x = new float[][]{{9, 13, 22},    //1
                                    {9, 13, 22},    //2
                                    {9, 13, 22},    //3
                                    {9, 13, 22},    //4
                                    {9, 13, 22},    //5
                                    {9, 13, 22},    //6
                                    {18, 0.5F, 1},  //7
                                    {15, 9, 30},    //8
                                    {17, 9, 1},     //9
                                    {8, 12, 16},    //10
                                    {13, 16, 19},   //11
                                    {8, 12, 5}      //12
        };
        for (int i = 0; i < 12; i++) {
            switch (i) {
                case 0 -> {
                    System.out.println("Calculate 1: y = x * (x + 45^2) + --x");
                    for (int j = 0; j < 3; j++) {
                        float y = x[i][j] * (x[i][j] + (float) Math.pow(45, 2)) + --x[i][j];
                        System.out.print("x = " + x[i][j] + " > y = " + y + " | ");
                    }
                    System.out.println();
                    System.out.println();
                }
                case 1 -> {
                    System.out.println("Calculate 2: y = (x + x^2) * ++x + 10");
                    for (int j = 0; j < 3; j++) {
                        float y = (x[i][j] + (float) Math.pow(x[i][j], 2)) * ++x[i][j] + 10;
                        System.out.print("x = " + x[i][j] + " > y = " + y + " | ");
                    }
                    System.out.println();
                    System.out.println();
                }
                case 2 -> {
                    System.out.println("Calculate 3: y = y = (x2 - x2 ) * 0.8 - x++");
                    for (int j = 0; j < 3; j++) {
                        float y = ((float) Math.pow(x[i][j], 2) - (float) Math.pow(x[i][j], 2)) * 0.8f - x[i][j]++;
                        System.out.print("x = " + x[i][j] + " > y = " + y + " | ");
                    }
                    System.out.println();
                    System.out.println();
                }
                case 3 -> {
                    System.out.println("Calculate 4: y = x^2 / (x^2 * 0.5) + x--");
                    for (int j = 0; j < 3; j++) {
                        float y = (float) Math.pow(x[i][j], 2) / ((float) Math.pow(x[i][j], 2) * 0.5f) + x[i][j]--;
                        System.out.print("x = " + x[i][j] + " > y = " + y + " | ");
                    }
                    System.out.println();
                    System.out.println();
                }
                case 4 -> {
                    System.out.println("Calculate 5: y = x4 / (0.5 - 40) - x++");
                    for (int j = 0; j < 3; j++) {
                        float y = (float) Math.pow(x[i][j], 4) / (0.5f - 40) - x[i][j]++;
                        System.out.print("x = " + x[i][j] + " > y = " + y + " | ");
                    }
                    System.out.println();
                    System.out.println();
                }
                case 5 -> {
                    System.out.println("Calculate 6: y = x^3 / 4 * --x + 4.0");
                    for (int j = 0; j < 3; j++) {
                        float y = (float) Math.pow(x[i][j], 3) / 4 * --x[i][j] + 4.0f;
                        System.out.print("x = " + x[i][j] + " > y = " + y + " | ");
                    }
                    System.out.println();
                    System.out.println();
                }
                case 6 -> {
                    System.out.println("Calculate 7: y = x /( x - 63^2) - --x");
                    for (int j = 0; j < 3; j++) {
                        float y = x[i][j] / (x[i][j] - 63 * 63) - --x[i][j];
                        System.out.print("x = " + x[i][j] + " > y = " + y + " | ");
                    }
                    System.out.println();
                    System.out.println();
                }
                case 7 -> {
                    System.out.println("Calculate 8: y = (x2 - x) * 10 + x--");
                    for (int j = 0; j < 3; j++) {
                        float y = ((float) Math.pow(x[i][j], 2) - x[i][j]) * 10 + x[i][j]--;
                        System.out.print("x = " + x[i][j] + " > y = " + y + " | ");
                    }
                    System.out.println();
                    System.out.println();
                }
                case 8 -> {
                    System.out.println("Calculate 9: y = (x^3 - x) * 0.12 / ++x");
                    for (int j = 0; j < 3; j++) {
                        float y = ((float) Math.pow(x[i][j], 3) - x[i][j]) * 0.12f / ++x[i][j];
                        System.out.print("x = " + x[i][j] + " > y = " + y + " | ");
                    }
                    System.out.println();
                    System.out.println();
                }
                case 9 -> {
                    System.out.println("Calculate 10: y = x^3 / (x^2 - 0.8) * x++");
                    for (int j = 0; j < 3; j++) {
                        float y = (float) Math.pow(x[i][j], 3) / ((float) Math.pow(x[i][j], 2) - 0.8f) * x[i][j]++;
                        System.out.print("x = " + x[i][j] + " > y = " + y + " | ");
                    }
                    System.out.println();
                    System.out.println();
                }
                case 10 -> {
                    System.out.println("Calculate 11: y = y = x^3 * 0.5 + 3.0 * x++");
                    for (int j = 0; j < 3; j++) {
                        float y = (float) Math.pow(x[i][j], 3) * 0.5f + 3.0f * x[i][j]++;
                        System.out.print("x = " + x[i][j] + " > y = " + y + " | ");
                    }
                    System.out.println();
                    System.out.println();
                }
                case 11 -> {
                    System.out.println("Calculate 12: y = x^2 * (4 + 0.58) / --x");
                    for (int j = 0; j < 3; j++) {
                        float y = (float) Math.pow(x[i][j], 2) * (4 + 0.58f) / --x[i][j];
                        System.out.print("x = " + x[i][j] + " > y = " + y + " | ");
                    }
                    System.out.println();
                    System.out.println();
                }
                default -> {
                }
            }
        }
    }
}
