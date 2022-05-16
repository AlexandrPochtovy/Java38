package com.company.peoples;

import com.company.udt.Address;
import com.company.udt.Person;

import java.util.ArrayList;

public class Metodist extends Person {
    private static int count;
    private ArrayList<Teacher> teachers;
//===================================================================================

    public Metodist(String name, String lastname) {
        super(name, lastname);
        this.teachers = teachers;
        this.teachers = new ArrayList<Teacher>();
    }

    public Metodist(String name, String lastname, int age) {
        super(name, lastname, age);
        this.teachers = new ArrayList<Teacher>();
    }

    public Metodist(String name, String lastname, int age, Address addr) {
        super(name, lastname, age, addr);
        this.teachers = new ArrayList<Teacher>();
    }

//=================================================================================

    public static int getCount() {
        return count;
    }
}
