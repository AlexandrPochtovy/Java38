package com.company.animals;

public class Horse extends Animal{
    final private String say = "Ffrrr!";//лошадь фырчит
    final private String meal = "trava";//лошадь ест траву

    public Horse(String name, int age, Food food, String location, double weight) {
        super(name, age, food, location, weight);
    }

    public Horse(int age, Food food, String location, double weight) {
        super(age, food, location, weight);
    }

    public Horse(int age, String location, double weight) {
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
