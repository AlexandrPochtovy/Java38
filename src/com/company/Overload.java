package com.company;

public class Overload {
    public static void main(String[] args) {
        System.out.println("Площадь круга = " + circleCalc(2.5));
        System.out.println("Площадь круга = " + circleCalc(5, false));
        System.out.println("Площадь круга = " + circleCalc(2.5, true));
    }

    static double circleCalc(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    static double circleCalc(double value, boolean select) {
        //select = 0 - value is diameter
        //select = 1 - value is circle length
        if (select) {
            return Math.pow(value, 2) / (4 * Math.PI);
        }
        else {
            return Math.PI * Math.pow(value, 2) / 4;
        }
    }
}
