package com.company.animals;

public class Cat extends Animal{
    final private String say = "Meow!";//кот мяукает
    final private String meal = "mouse";//кот ест мышь

    public Cat(String name, int age, Food food, String location, double weight) {
        super(name, age, food, location, weight);
    }

    public Cat(int age, Food food, String location, double weight) {
        super(age, food, location, weight);
    }

    public Cat(int age, String location, double weight) {
        super(age, location, weight);
    }

    //realisation   ========================================================
    @Override
    public void makeNoise() {
        System.out.println(super.getName() + say);
    }

    @Override
    public void eat() {
        System.out.println(super.getName() + " eat " + meal);
    }

    @Override
    public void sleep() {
        System.out.println(super.getName() + " sleep");
    }
}
