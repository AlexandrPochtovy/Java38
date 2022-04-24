package com.company.animals;

import com.company.professions.Address;

public class Veterinar extends Person {
    public Veterinar(String name, String lastname, int age) {
        super(name, lastname, age);
    }
    public Veterinar(String name, String lastname, int age, Address addr) {
        super(name, lastname, age, addr);
    }
    //realisation   ===========================================================
    public void treatAnimal(Animal animal) {
        final String s = animal.getName() + " " + animal.getFood() + " " + animal.getLocation();
        System.out.println(s);
    }

}
