package com.company.animals;

public class Dog extends Animal{
    final private String say = "RrrRr!";//собака лает
    final private String meal = "bounce";//собака грызет кость

    public Dog(String name, int age, Food food, String location, double weight) {
        super(name, age, food, location, weight);
    }

    public Dog(int age, Food food, String location, double weight) {
        super(age, food, location, weight);
    }

    public Dog(int age, String location, double weight) {
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
