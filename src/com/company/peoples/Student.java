package com.company.peoples;

import com.company.userdatatype.Address;
import com.company.userdatatype.Person;

public class Student extends Person {
    private static int count;

    public Student(String name, String lastname) {
        super(name, lastname);
        ++count;
    }

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