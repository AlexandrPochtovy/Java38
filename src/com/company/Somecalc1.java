package com.company;
/*
Задано вещественное значение аргумента x. Вычислите значение функции y и выведите на экран.
y = x * x + 452;	x = 20; x = 10; x = 1;
y = x + x2 * 10;	x = 15; x = 9; x = 30;
y = x2 - x2 * 0.8;	x = 17; x = 10; x = 1;
y = x2 / x2 * 0.5;	x = 8; x = 12; x = 10;
y = x4 / 0.5 - 40;	x = 3; x = 16; x = 20;
y = x3 / 4 * 4.0;	x = 36; x = 10; x = 1;
y = x / x - 632;	x = 20; x = 10; x = 1;
y = x2 - x * 10;	x = 15; x = 9; x = 30;
y = x3 - x * 0.12;	x = 17; x = 10; x = 1;
y = x3 / x2 * 0.8;	x = 8; x = 12; x = 10;
y = x3 * 0.5 + 3.0;	x = 3; x = 16; x = 20;
y = x2 * 4 * 0.58;	x = 36; x = 10; x = 1;
* */
public class Somecalc1 {
    public static void main (String [] args) {
        float[][] x = new float[][]{{20, 10, 1},
                                    {15, 9, 30},
                                    {17, 10, 1},
                                    {8, 12, 10},
                                    {3, 16, 20},
                                    {36, 10, 1},
                                    {20, 10, 1},
                                    {15, 9, 30},
                                    {17, 10, 1},
                                    {8, 12, 10},
                                    {3, 16, 20},
                                    {36, 10, 1}
        };
        for (int i = 0; i < 12; i++) {
            switch (i) {
                case 0:
                    System.out.println("Calculate 1: y = x * x + 45^2");
                    for (int j = 0; j < 3; j++) {
                        float y = x[i][j] * x[i][j] + (float)Math.pow(45, 2);
                        System.out.print("x = " + x[i][j]);
                        System.out.print("  y = " + y + " | ");
                    }
                    System.out.println();System.out.println();
                    break;

                case 1:
                    System.out.println("Calculate 2: y = x + x^2 * 10");
                    for (int j = 0; j < 3; j++) {
                        float y = x[i][j] + (float)Math.pow(x[i][j], 2) * 10;
                        System.out.print("x = " + x[i][j]);
                        System.out.print("  y = " + y + " | ");
                    }
                    System.out.println();System.out.println();
                    break;

                case 2:
                    System.out.println("Calculate 3: y = x^2 - x^2 * 0.8");
                    for (int j = 0; j < 3; j++) {
                        float y = (float)Math.pow(x[i][j], 2) - (float)Math.pow(x[i][j], 2) * 0.8f;
                        System.out.print("x = " + x[i][j]);
                        System.out.print("  y = " + y + " | ");
                    }
                    System.out.println();System.out.println();
                    break;

                case 3:
                    System.out.println("Calculate 4: y = x^2 / x^2 * 0.5");
                    for (int j = 0; j < 3; j++) {
                        float y = (float)Math.pow(x[i][j], 2) / (float)Math.pow(x[i][j], 2) * 0.5f;
                        System.out.print("x = " + x[i][j]);
                        System.out.print("  y = " + y + " | ");
                    }
                    System.out.println();System.out.println();
                    break;

                case 4:
                    System.out.println("Calculate 5: x4 / 0.5 - 40");
                    for (int j = 0; j < 3; j++) {
                        float y = (float)Math.pow(x[i][j], 4) / 0.5f - 40;
                        System.out.print("x = " + x[i][j]);
                        System.out.print("  y = " + y + " | ");
                    }
                    System.out.println();System.out.println();
                    break;

                case 5:
                    System.out.println("Calculate 6: y = x3 / 4 * 4.0");
                    for (int j = 0; j < 3; j++) {
                        float y = (float)Math.pow(x[i][j], 3) / 4 * 4.0f;
                        System.out.print("x = " + x[i][j]);
                        System.out.print("  y = " + y + " | ");
                    }
                    System.out.println();System.out.println();
                    break;

                case 6:
                    System.out.println("Calculate 7: y = x / x - 63^2");
                    for (int j = 0; j < 3; j++) {
                        float y = x[i][j] / x[i][j] - 63 * 63;
                        System.out.print("x = " + x[i][j]);
                        System.out.print("  y = " + y + " | ");
                    }
                    System.out.println();System.out.println();
                    break;

                case 7:
                    System.out.println("Calculate 8: y = x^2 - x * 10");
                    for (int j = 0; j < 3; j++) {
                        float y = (float)Math.pow(x[i][j], 2) - x[i][j] * 10;
                        System.out.print("x = " + x[i][j]);
                        System.out.print("  y = " + y + " | ");
                    }
                    System.out.println();System.out.println();
                    break;

                case 8:
                    System.out.println("Calculate 9: y = x3 - x * 0.12");
                    for (int j = 0; j < 3; j++) {
                        float y = (float)Math.pow(x[i][j], 3) - x[i][j] * 0.12f;
                        System.out.print("x = " + x[i][j]);
                        System.out.print("  y = " + y + " | ");
                    }
                    System.out.println();System.out.println();
                    break;

                case 9:
                    System.out.println("Calculate 10: y = x3 / x2 * 0.8");
                    for (int j = 0; j < 3; j++) {
                        float y = (float)Math.pow(x[i][j], 3) / (float)Math.pow(x[i][j], 2) * 0.8f;
                        System.out.print("x = " + x[i][j]);
                        System.out.print("  y = " + y + " | ");
                    }
                    System.out.println();System.out.println();
                    break;

                case 10:
                    System.out.println("Calculate 11: y = x^3 * 0.5 + 3.0");
                    for (int j = 0; j < 3; j++) {
                        float y = (float)Math.pow(x[i][j], 3) * 0.5f + 3.0f;
                        System.out.print("x = " + x[i][j]);
                        System.out.print("  y = " + y + " | ");
                    }
                    System.out.println();System.out.println();
                    break;

                case 11:
                    System.out.println("Calculate 12: y = x2 * 4 * 0.58");
                    for (int j = 0; j < 3; j++) {
                        float y = (float)Math.pow(x[i][j], 2) * 4 * 0.58f;
                        System.out.print("x = " + x[i][j]);
                        System.out.print("  y = " + y + " | ");
                    }
                    System.out.println();System.out.println();
                    break;

                default:
                    break;
            }
        }
    }
}