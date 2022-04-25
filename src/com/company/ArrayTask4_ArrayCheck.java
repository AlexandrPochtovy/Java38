package com.company;

import java.util.Scanner;

public class ArrayTask4_ArrayCheck {
    public static void main(String[] args) {
        int len;//array len
        int mainArray[];
        int checkArray[];
        System.out.println("Set main array size ");
        Scanner sc = new Scanner(System.in);
        len = sc.nextInt();
        mainArray = new int[len];
        System.out.println("Set check array size ");
        len = sc.nextInt();
        checkArray = new int[len];
        sc.close();
        for (int i = 0; i < mainArray.length; i++) {
            mainArray[i] = (int)(20 * Math.random() - 10.0d);
        }
        for (int i = 0; i < checkArray.length; i++) {
            checkArray[i] = (int)(20 * Math.random() - 10.0d);
        }
        System.out.println("Main array values before check");
        ArrayPrint(mainArray);
        System.out.println("Check array values");
        ArrayPrint(checkArray);
        System.out.println("Result array values");
        ArrayPrint(CheckArrayOld(mainArray, checkArray));
        ArrayPrint(CheckArrayNew(mainArray, checkArray));
    }

    static void ArrayPrint(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    /*решение в лоб:
    сделал какую-то ерунду пришлось задействовать аж два массива дополнительных
    * хотел сделать красиво, сдвигая основной массив на число удаляемых элементов
    * и потом копировать это в результирующий массив, но не придумал как
    *  */
    static int[] CheckArrayOld(int[] main, int[] check) {
        int insertIndex = 0;
        byte found = 0;
        int buf[] = new int[main.length];
        for (int i = 0; i < main.length;i++) {
            found = 0;
            for (int j = 0; j < check.length; j++) {
                if (main[i] == check[j]) {
                    found = 1;
                    break;
                }
            }
            if (found == 0) {
                buf[insertIndex++] = main[i];
            }
        }
        int result[] = new int[insertIndex];
        for (int i = 0; i < insertIndex; i++) {
            result[i] = buf[i];
        }
        return result;
    }

    /*красивое решение
    * сдвигаем основной массив если найдено совпадение с любым из проверочного массива
    * */
    static int[] CheckArrayNew(int[] main, int[] check) {
        int baseLen = main.length;
        for (int i = 0; i < check.length;i++) {
            for (int j = 0; j < baseLen; j++) {
                if (main[j] == check[i]) {
                    --baseLen;
                    for (int k = j; k < baseLen; k++) {
                        main[k] = main[k+1];
                    }
                    i = 0;
                    break;
                }
            }
        }
        int result[] = new int[baseLen];
        for (int i = 0; i < baseLen; i++) {
            result[i] = main[i];
        }
        return result;
    }
}
