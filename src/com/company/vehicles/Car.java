package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    public final String model;
    public final String classCar;
    private int weight;
    private Driver carDriver;
    private Engine engine;
//--------------------------------------------------------------
    public Car(String model, String classCar, int weight, Engine engine) {
        this.model = model;
        this.classCar = classCar;
        this.setWeight(weight);
        this.carDriver = null;
        this.engine = engine;
    }

    public Car(String model, String classCar, int weight, Engine engine, Driver carDriver) {
        this.model = model;
        this.classCar = classCar;
        this.setWeight(weight);
        this.carDriver = carDriver;
        this.engine = engine;
    }
//----------------------------------------------------------------
    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight > 0 ? weight : 0;
    }

    public Driver getCarDriver() {
        return this.carDriver;
    }

    public void setCarDriver(Driver carDriver) {
        this.carDriver = carDriver;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        System.out.println("Go forward!");
    }

    public void stop() {
        System.out.println("Stop machine!");
    }

    public void turnRight() {
        System.out.println("Go turn right.");
    }

    public void turnLeft() {
        System.out.println("Go turn left.");
    }

    @Override
    public String toString() {
        final String s = "Car: " +
                "model '" + model + '\'' +
                ", class '" + classCar + '\'' +
                ", weight=" + weight +
                ", " + carDriver.toString() +
                ", " + engine.toString() +
                ' ';
        return s;
    }
}
