package com.company.model;

import com.company.base.Person;

import java.util.ArrayList;

public class Metodist extends Person {
    private static int count;//счетчик созданных объектов
    private ArrayList<Teacher> teachers;//список учителей

    public Metodist(String name, String lastname, int age) {
        super(name, lastname, age);
        this.teachers = new ArrayList<Teacher>();//пустой список учителей
        ++count;
    }

    public Metodist(String name, String lastname, int age, Address addr) {
        super(name, lastname, age, addr);
        this.teachers = new ArrayList<Teacher>();//пустой список учителей
        ++count;
    }

    public Metodist(String name, String lastname, int age, ArrayList<Teacher> teachers) {
        super(name, lastname, age);
        this.teachers = teachers;
        ++count;
    }

    public Metodist(String name, String lastname, int age, Address addr, ArrayList<Teacher> teachers) {
        super(name, lastname, age, addr);
        this.teachers = teachers;
        ++count;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    public void addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }

    public Teacher getTeacher(int index) {
        return teachers.get(index);
    }

    public static int getCount() {
        return count;
    }
}
