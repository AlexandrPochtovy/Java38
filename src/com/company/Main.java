package com.company;

import java.util.ArrayList;
import java.util.Comparator;

import com.company.peoples.Metodist;
import com.company.peoples.Student;
import com.company.peoples.Teacher;
import com.company.udt.Address;
import com.company.util.CompareAge;
import com.company.util.TeacherToMetodist;

public class Main {

    public static void main(String[] args) {
	//Scool project branch feature add first Classes
        Address addr1 = new Address("Minsk", "Pushkina pr", 17, 2);
        Address addr2 = new Address("Paris", "Central avenue", 3, 4);

        Student stud1 = new Student("Ivan", "Ivanov", 18, addr1);
        Student stud2 = new Student("Sergey", "Esenin", 19, addr1);
        Student stud3 = new Student("Nikolas", "Petrov", 21, addr2);
        Teacher teacher = new Teacher("Victor", "Petrov", 32,
                                      new Address("Minsk", "Nemiga", 4, 12));

        GroupEdu group114 = new GroupEdu("Business model", 1, teacher, 25);
        group114.addStudent(stud1);
        group114.addStudent(stud2);
        group114.addStudent(stud3);
        group114.AddressChange(stud1, addr1);

        TeacherToMetodist<Teacher, Metodist> conv;
        conv = x -> new Metodist(x.getName(), x.getLastname(), x.getAge(), x.getAddr());
        Metodist met1 = conv.convert(teacher);

        ArrayList<Student> myGroup = new ArrayList<Student>(){{
            add(stud3);
            add(stud2);
            add(stud1);
        }};

        Comparator ageComp = new CompareAge();

        /*myGroup.stream().sorted(ageComp).forEach(step -> {
            System.out.println(step.toString());
        });*/
        myGroup.stream().sorted().forEach(step -> {
            System.out.println(step.toString());
        });
    }
}
