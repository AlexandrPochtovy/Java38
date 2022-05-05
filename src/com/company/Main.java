package com.company;

import com.company.udt.Address;
import com.company.udt.TeacherToMetodist;

public class Main {

    public static void main(String[] args) {
	//Scool project branch feature add first Classes
        Address studAddr = new Address("Minsk", "Pushkina pr", 17, 2);

        Student stud1 = new Student("Ivan", "Ivanov", -2, studAddr);
        Student stud2 = new Student("Ivan", "Ivanov", 18, studAddr);
        Teacher teacher = new Teacher("Victor", "Petrov", 32,
                                        new Address("Minsk", "Nemiga", 4, 12));

        TeacherToMetodist<Teacher, Metodist> conv = x -> new Metodist(x.getName(), x.getLastname(), x.getAge());
        Metodist met1 = conv.convert(teacher);
    }
}
