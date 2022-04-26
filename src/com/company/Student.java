package com.company;

import com.company.udt.Address;
import com.company.udt.Person;

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

    public static int getCount() {
        return count;
    }

}
