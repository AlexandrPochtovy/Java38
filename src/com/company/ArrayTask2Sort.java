package com.company;

import java.util.Scanner;

public class ArrayTask2Sort {
public static void main(String[] args) {
    int len;//array len
    int myArray[];
    System.out.println("Set array size ");
    Scanner sc = new Scanner(System.in);
    len = sc.nextInt();
    myArray = new int[len];
    for (int i = 0; i < myArray.length; i++) {
        myArray[i] = (int)(20 * Math.random() - 10.0d);
    }
    System.out.println("Array values before sort");
    ArrayPrint(myArray);

    ArrayBubbleSort(myArray);
    //ArraySelectSort(myArray);
    //ArrayInsertSort(myArray);
    System.out.println("Array values after sort");
    ArrayPrint(myArray);
}

    static void ArrayPrint(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    static void ArrayBubbleSort(int[] data) {//честно украл у примеров по С++
        int len = data.length;
        int buf = 0;
        for (int i = 0; i <len ; i++) {
            for (int j = len-1; j > i; j--) {
                if (data[j-1] > data[j]) {
                    buf = data[j-1]; data[j-1] = data[j];
                    data[j] = buf;
                }
            }
        }
    }

    static void ArraySelectSort(int[] data) {//честно украл и переписал из примеров по С++
        int len = data.length;
        for (int i = 0; i <len ; i++) {
            int buf = data[i];
            int index = i;
            for (int j = i; j < len; j++) {
                if (data[j] < buf) {
                    index = j;
                    buf = data[j];
                }
            }
            data[index] = data[i];
            data[i] = buf;
        }
    }

    static void ArrayInsertSort (int[] data) {
        for (int i = 1; i < data.length; i++) {
            int buff = data[i]; // запомним обрабатываемый элемент
            // и начнем перемещение элементов слева от него
            // пока запомненный не окажется меньше чем перемещаемый
            for (int j = i - 1; (j >= 0 && data[j] > buff); j--) {
                data[j + 1] = data[j];
                data[j] = buff; // и поставим запомненный на его новое место
            }
        }
    }

    static void ArrayMergeSort (int[] data) {//TODO
        ;
    }

    static void ArrayPyramidSort (int[] data) {//TODO
        ;
    }

    static void ArrayQuickSort (int[] data) {//TODO
        ;
    }

    public static class Recursion {
        public static void main(String[] args) {
            printNumber(5);
            System.out.println();
            System.out.println(summDigit(123411));
        }

        static void printNumber(int N) {
            System.out.println(N);
            if (N == 1) {
                return;
            } else {
                printNumber(N-1);
            }
        }

        static int summDigit(int N) {
            int summ = 0;
            if (N < 10) {
                summ += N;
            } else {
                summ+= (N % 10 + summDigit((N - N % 10)/10));
            }
            return summ;
        }
    }
}
