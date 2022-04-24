package com.company.professions;

public class Driver extends Person {
    private static int count;
    private int rangDrive;
//----------------------------------------------------------------
    public Driver(String name, String lastname, int age) {
        super(name, lastname, age);
        rangDrive = 0;
        ++count;
    }

    public Driver(String name, String lastname, int age, Address addr) {
        super(name, lastname, age, addr);
        rangDrive = 0;
        ++count;
    }

    public Driver(String name, String lastname, int age, Address addr, int rangDrive) {
        super(name, lastname, age, addr);
        this.rangDrive = rangDrive;
        ++count;
    }
//------------------------------------------------------
    @Override
    public String toString() {
        final String s = "Driver: " + super.toString() + ", rangDrive=" + this.rangDrive + " ";
        return s;
    }
}
