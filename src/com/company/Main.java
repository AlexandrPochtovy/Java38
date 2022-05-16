package com.company;

import com.company.peoples.Metodist;
import com.company.peoples.Student;
import com.company.peoples.Teacher;
import com.company.udt.Address;
import com.company.util.TeacherToMetodist;

import com.company.base.Box;
import com.company.model.Car;
import com.company.model.Ship;
import com.company.util.MaxPowerCompare;
import java.util.*;

public class Main {

    public static void main(String[] args) {


	//Scool project branch feature add first Classes
        Address studAddr = new Address("Minsk", "Pushkina pr", 17, 2);

        Student stud1 = new Student("Ivan", "Ivanov", 18, studAddr);
        Student stud2 = new Student("Sergey", "Esenin", 19, studAddr);
        Teacher teacher = new Teacher("Victor", "Petrov", 32,
                                        new Address("Minsk", "Nemiga", 4, 12));

        GroupEdu group114 = new GroupEdu("Business model", 1, teacher, 25);
        group114.addStudent(stud1);
        group114.addStudent(stud2);
        group114.AddressChange(stud1, studAddr);

        TeacherToMetodist<Teacher, Metodist> conv;
        conv = x -> new Metodist(x.getName(), x.getLastname(), x.getAge(), x.getAddr());
        Metodist met1 = conv.convert(teacher);

	// initial Lesson 11 class branch
/*
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
        listCar.stream().sorted(powerComp).forEach(step -> {
                System.out.println(step);
                int c = step.hashCode();
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

        Collections.sort(listCar, powerComp);

 */
        Box<String> myBox = new Box<String>("peppa");
        System.out.println(myBox.getT());

        Box<Integer> intBox = new Box<>(45);
        System.out.println(intBox.getT());

        ArrayList<Box> boxes = new ArrayList<Box>(){{
            add(myBox);
            add(intBox);
            add(new Box(11));
            add(new Box("wer"));

        }};
        boxes.stream().filter(b -> b.getT().equals("Hello")).forEach(step -> {
            System.out.println(step);
            boxes.stream().iterator().next();
        });

    }
}
