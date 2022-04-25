package com.company;

public class TaskRecursive {
    public static void main(String[] args) {
        PrintN(5);
        System.out.println();
        System.out.println(CalcDigit(123456789));
    }

    public static void PrintN(int N) {//печатает от N до 1
        System.out.println(N);
        if (N == 1) {
            return;
        } else {
            PrintN(N-1);
        }
    }

    public static int CalcDigit(int N) {
        //int summ = 0;
        if (N < 10) {
            return N;
        } else {
            return N % 10 + CalcDigit(N / 10);
        }
    }
}
