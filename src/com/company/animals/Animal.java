package com.company.animals;

public abstract class Animal {
    private String name;                //кличка
    private int age;                    //возраст
    private Food food;                  //состояние еды
    private String location;            //местоположение животного
    private double weight;              //вес животного

    public Animal(String name, int age, Food food, String location, double weight) {
        this.name = name;
        this.age = age;
        this.food = food;
        this.location = location;
        this.weight = weight;
    }
    public Animal(int age, Food food, String location, double weight) {
        this.name = "noname";
        this.age = age;
        this.food = food;
        this.location = location;
        this.weight = weight;
    }
    public Animal(int age, String location, double weight) {
        this.name = "noname";
        this.age = age;
        this.food = Food.HUNGRY;
        this.location = location;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age > 0 ? age : 0;
    }

    public Food getFood() {
        return food;
    }
    public void setFood(Food food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight > 0 ? weight : 0.0d;
    }

    //virtual   ========================================================
    public abstract void makeNoise();

    public abstract void eat();

    public abstract void sleep();

}
