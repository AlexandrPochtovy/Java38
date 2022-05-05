package com.company;

import com.company.model.Car;
import com.company.model.Ship;
import com.company.util.MaxPowerCompare;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// initial Lesson 11 class branch

        Comparator powerComp = new MaxPowerCompare();
        Car car1 = new Car("Audi", "red", 1120);
        Car car2 = new Car("Opel", "green", 1010);
        Car car3 = new Car("Ferrary", "blue", 1340);
        Car car4 = new Car("Mersedes", "black", 1420);
        Car car5 = new Car("Peaugeot", "white", 1110);
        List<Car> listCar = new ArrayList<Car>() {{
            add(car1);//это просто еще один синтаксис добавления
            add(car2);
            add(car3);
            add(car4);
            add(car5);
        }};
        listCar.stream().sorted(powerComp).forEach(car -> {
                System.out.println(car);
                int c = car.hashCode();
         });

        ArrayList<Ship> armada = new ArrayList<Ship>(){{
            add(new Ship("Zews", 15000, 3));
            add(new Ship("Ares", 9800, 2));
            add(new Ship("Appolon", 12000, 2));
            add(new Ship("COUZ", 15000, 1));
            add(new Ship("Peppa", 9800, 7));
            add(new Ship("Zulu", 12000, 4));
        }};

        armada.stream().sorted().forEach(step ->
                System.out.println(step.name));
    }




}
