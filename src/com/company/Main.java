package com.company;

import com.company.details.Engine;
import com.company.professions.*;

import com.company.vehicles.Car;

public class Main {

    public static void main(String[] args) {
	// Lesson 4 feature branch
        Car audi = new Car("Audi A8", "sedan", 1320,
                new Engine("Audi V6-turbo", 250));
        Driver driver1 = new Driver("Lex", "Luter", 31,
                new Address("London", "Beikery str", 15, 2), 3);
        audi.setCarDriver(driver1);
        System.out.print(audi.toString());
    }
}
