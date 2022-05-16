package com.company.model;

public class Ship implements Comparable<Ship> {
    public final String name;
    private int weight;
    private int size;

    public Ship(String name, int weight, int size) {
        this.name = name;
        this.weight = weight;
        this.size = size;
    }

    @Override
    public int compareTo(Ship ship) {
        if (this.weight > ship.weight) {
            return 1;
        } else if (this.weight < ship.weight) {
            return -1;
        } else return (this.size - ship.size);
    }
}
