package com.company;

import com.company.animals.*;
import com.company.details.Engine;
import com.company.professions.*;
import com.company.professions.Address;
import com.company.vehicles.Car;

public class Main {

    public static void main(String[] args) {
	// Lesson 4 feature branch
        Car audi = new Car("Audi A8", "sedan", 1320,
                new Engine("Audi V6-turbo", 250));
        Driver driver1 = new Driver("Lex", "Luter", 31,
                new Address("London", "Beikery str", 15, 2), 3);
        audi.setCarDriver(driver1);
        System.out.println(audi.toString());

        Veterinar doctor = new Veterinar("Emil", "Beldon", 32,
                new Address("Minsk", "Beregovaya", 15, 122));

        Cat Shani = new Cat("Shani", 2, Food.FULL, "Minsk", 3.2);
        Dog Bobby = new Dog("Bobby", 1, Food.HUNGRY, "Brest", 5.3);
        Horse Plotva = new Horse("Plotva", 3, Food.FULL, "Velen", 12.7);
        Animal animals[] = {Shani, Bobby, Plotva};
        for (int i = 0; i < animals.length; i++) {
            doctor.treatAnimal(animals[i]);
        }
    }
}
