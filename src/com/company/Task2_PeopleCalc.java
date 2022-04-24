package com.company;
/*
* В стране XYZ население равно 10 миллионов человек.
* Рождаемость составляет 14 человек на 1000 человек, смертность - 8 человек.
* Рассчитайте, какая численность населения будет через 10 лет, принимая во внимание,
* что показатели рождаемости и смертности постоянны.
 * */
import java.util.Scanner;

public class Task2_PeopleCalc {
    public static void main (String [] args) {
        int peopleNnum;     //начальная численность населения чел
        int newPeople;      //рождаемость на 1000 чел
        int deathPeople;    //смертность на 1000 чел
        int meas;           //интервал анализа
        Scanner sc = new Scanner(System.in);
        System.out.print("Задайте начальную численность населения = ");
        peopleNnum = sc.nextInt();
        System.out.print("Задайте коэффициент рождаемости на 1000 чел = ");
        newPeople = sc.nextInt();
        System.out.print("Задайте коэффициент смертности на 1000 чел = ");
        deathPeople = sc.nextInt();
        System.out.print("Задайте период анализа, лет = ");
        meas = sc.nextInt();
        for (int i = 0; i < meas; i++) {
            peopleNnum += (newPeople - deathPeople) * (peopleNnum / 1000);
        }
        System.out.print("Итоговая численность после " + meas + " лет составит " + peopleNnum + " человек");
    }
}
