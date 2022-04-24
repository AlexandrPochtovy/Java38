package com.company;

public class Teacher  {
    private String name;
    private String lastname;
    private int age;
    private Address addr;
    private double money;
//===================================================================================
    public Teacher(String name, String lastname, int age, Address addr, double money) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.addr = addr;
        this.money = money;
    }
    public Teacher(String name, String lastname, int age, Address addr) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.addr = addr;
        this.money = 0.0d;
    }
    public Teacher(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.addr = null;
        this.money = 0.0d;
    }
//=================================================================================

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddr() {
        return addr;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money >= 0.0d ? money : 0.0d;
    }
}
