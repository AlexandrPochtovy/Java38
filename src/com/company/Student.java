package com.company;

public class Student extends Person {
    private static int count;

    public Student(String name, String lastname, int age) {
        super(name, lastname, age);
        ++count;
    }

    public Student(String name, String lastname, int age, Address addr) {
        super(name, lastname, age, addr);
        ++count;
    }

    public int getCount() {
        return count;
    }

}
