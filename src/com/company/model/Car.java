package com.company.model;

public class Car implements Comparable<Car> {
    public final String model;
    private String color;
    private int power;

    public Car(String model, String color, int power) {
        this.model = model;
        this.color = color;
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        final String s = "Car: " +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", power=" + power;
        return s;
    }

    @Override
    public int compareTo(Car o) {
        return this.power - o.power;
    }
}
