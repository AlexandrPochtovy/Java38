package com.company;

import com.company.exceptions.AgeLimitException;
import com.company.udt.Address;
import com.company.util.TeacherToMetodist;

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
        //group114.AddressChange(stud1, studAddr);

        //TeacherToMetodist<Teacher, Metodist> conv = x -> new Metodist(x.getName(), x.getLastname(), x.getAge());
        //Metodist met1 = conv.convert(teacher);
    }
}
