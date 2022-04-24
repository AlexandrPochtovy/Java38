package com.company;
/*
* За каждый месяц банк начисляет к сумме вклада 7% от суммы. Напишите консольную программу,
* в которую пользователь вводит сумму вклада и количество месяцев.
* А банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц.
Для вычисления суммы с учетом процентов используйте цикл for. Пусть сумма вклада будет представлять тип float.
* */
import java.util.Scanner;

public class Task3_DepoCalcFor {
    public static void main (String [] args) {
        float depo;     //начальная сумма вклада
        float percent;  //ставка, %
        int meas;       //интервал накопления, месяцы
        Scanner sc = new Scanner(System.in);
        System.out.print("Задайте начальную сумму вклада = ");
        depo = sc.nextInt();
        System.out.print("Задайте ставку вклада = ");
        percent = sc.nextInt();
        System.out.print("Задайте период расчета, месяцев = ");
        meas = sc.nextInt();
        for (int i = 0; i < meas; i++) {
            depo += depo * percent / 100.0f;
        }
        System.out.print("Итоговая сумма вклада после " + meas + " месяцев составит " + depo + " денег");
    }
}
