package com.company;
/*Перепишите предыдущую программу про банк, только вместо цикла for используйте цикл while.*/
import java.util.Scanner;

public class Task4_DepoCalcWhile {
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
        int i = 0;
        while (i < meas) {
            depo += depo * percent / 100.0f;
            i++;
        }
        System.out.print("Итоговая сумма вклада после " + meas + " месяцев составит " + depo + " денег");
    }
}
