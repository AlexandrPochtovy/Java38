package com.company.model;

import com.company.model.Address;
import com.company.base.Person;

public class Teacher extends Person {
    private static int count;//счетчик созданных объектов
    private double money;   //количество денег
    private int studentCount;//число обучаемых студентов, используется в расчете ЗП

    public Teacher(String name, String lastname, int age) {
        super(name, lastname, age);
        ++count;
        money = 0;//нет денег
        studentCount = 0;//нет студентов
    }

    public Teacher(String name, String lastname, int age, Address addr) {
        super(name, lastname, age, addr);
        ++count;
        money = 0;//нет денег
        studentCount = 0;//нет студентов
    }

    public Teacher(String name, String lastname, int age, int studentCount) {
        super(name, lastname, age);
        this.studentCount = studentCount;
        ++count;
        money = 0;//нет денег
    }

    public Teacher(String name, String lastname, int age, Address addr, int studentCount) {
        super(name, lastname, age, addr);
        this.studentCount = studentCount;
        ++count;
        money = 0;//нет денег
    }

    public Teacher(String name, String lastname, int age, Address addr, double money, int studentCount) {
        super(name, lastname, age, addr);
        this.studentCount = studentCount;
        this.money = money;
        ++count;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public double getMoney() {
        return money;
    }
    public void setMoney(double money) {
        this.money = money >= 0.0d ? money : 0.0d;
    }
    public double salary(int day, int count, double koef) {
        return day * count * koef;
    }
    public double salary(int day, double koef) {
        return day * studentCount * koef;
    }

    public static int getCount() {
        return count;
    }
}
