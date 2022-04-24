package com.company;

public class Main {

    public static void main(String[] args) {
	//Scool project branch feature add first Classes
        Address studAddr = new Address("Minsk", "Pushkina pr", 17, 2);
        Student stud = new Student("Ivan", "Ivanov", 18, studAddr);
        Teacher teacher = new Teacher("Victor", "Petrov", 32,
                                        new Address("Minsk", "Nemiga", 4, 12));

    }
}
