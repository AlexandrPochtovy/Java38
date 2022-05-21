package com.company.model;

import com.company.base.Person;

import java.util.ArrayList;

public class Metodist extends Person {
    private static int count;
    private ArrayList<Teacher> teachers;
//===================================================================================

    public Metodist(String name, String lastname) {
        super(name, lastname);
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

    public ArrayList<Teacher> getAllTeachers() {
        return teachers;
    }

    public void setAllTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    public void addTeacher(Teacher teachers) {
        this.teachers.add(teachers);
    }

    public Teacher getTeacher(int index) {
        return teachers.get(index);
    }
//=================================================================================

    public static int getCount() {
        return count;
    }
}
