package com.company;

import java.util.Scanner;
public class ArrayTask1Found {
    public static void main (String[] args) {
        int len;//array len
        double myArray[];
        System.out.println("Set array size ");
        Scanner sc = new Scanner(System.in);
        len = sc.nextInt();
        myArray = new double[len];
        System.out.println("Array values");
        for (double step : myArray) {// fill array -10..10
            step = 20 * Math.random() - 10.0d;
            System.out.print(step + " ");
        }
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = 20 * Math.random() - 10.0d;
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
        System.out.println("Minimal value = " + MinVal(myArray));
        System.out.println("Maximal value = " + MaxVal(myArray));
        System.out.println("Average value = " + AveVal(myArray));
    }
//============================================================================
    static double MinVal(double[] data) {//minimal value
        double val = 0;
        for (int i = 0; i < data.length; i++) {
            if (val < data[i]) {val = data[i];}
        }
        return val;
    }

    static double MaxVal(double[] data) {//maximal value
        double val = 0;
        for (double step : data) {
            if (val > step) {val = step;}
        }
        return val;
    }

    static double AveVal(double[] data) {//average value
        double val = 0;
        for (double step : data) {
            val += step;
        }
        return val / data.length;
    }
}
