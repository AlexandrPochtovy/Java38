package com.company.professions;

public abstract class Person {
    private String name;
    private String lastname;
    private int age;
    private Address addr;
//===================================================================================
    public Person(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.addr = null;
    }

    public Person(String name, String lastname, int age, Address addr) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.addr = addr;
    }
//===================================================================================
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

    @Override
    public String toString() {
        final String s = " name " + name +
                        " lastname " + lastname +
                        " age " + age + " " +
                        addr.toString();
        return s;
    }
}
