package com.company;

import com.company.converters.TeacherToMetodist;
import com.company.exceptions.FileCheckException;
import com.company.peoples.Metodist;
import com.company.peoples.Student;
import com.company.peoples.Teacher;
import com.company.userdatatype.Address;
import com.company.util.FileParser;

import java.util.ArrayList;

public class Main {
    private static final String studentsPatch = "students.txt";//путь к файлу списка студентов
    private static final String teachersPatch = "teachers.txt";//путь к файлу списка учителей
    private static final String metodistPatch = "metodist.txt";//путь к файлу списка методистов

    public static void main(String[] args) {
        TeacherToMetodist<Teacher, Metodist> convTeachToMet;
        convTeachToMet = (x) -> new Metodist(x.getName(), x.getLastname(), x.getAge(), x.getAddr());
        TeacherToMetodist<Metodist, Teacher> convMetToTeach;
        convMetToTeach = (x) -> new Teacher(x.getName(), x.getLastname(), x.getAge(), x.getAddr());

        Metodist senior;
        //две группы, сейчас будем заполнять их судентами и кураторами
        GroupEdu groupOne = new GroupEdu("Management", 1);
        GroupEdu groupTwo = new GroupEdu("Business", 2);

        ArrayList<Teacher> listTeacher = new ArrayList<Teacher>();
        ArrayList<Student> listStudent = new ArrayList<Student>();

        //парсим список студентов
        ArrayList<String> dataString = new ArrayList<String>();
        try {
            dataString = FileParser.ListParser(studentsPatch);//создан массив строк из файла
            for (String value : dataString) {
                /*теперь каждую строку из массива разбили на массив отдельных строк
                * и каждый элемент-строку занесли в данные конструктора студента*/
                String[] tempStr = FileParser.StringParser(value);
                listStudent.add(new Student(tempStr[0],                                     //name
                                            tempStr[1],                                     //lastname
                                            Integer.parseInt(tempStr[2], 10),          //age
                                            new Address(tempStr[3],                         //city
                                                        tempStr[4],                         //street
                                                    Integer.parseInt(tempStr[5], 10),  //building
                                                    Integer.parseInt(tempStr[6], 10)   //flat
                                            )));
            }
        } catch (FileCheckException e) {
            System.out.println(e.getMessage());//e.printStackTrace();
        }
        //студентов распарсили, заполняем группу
        for (Student value : listStudent) {
            groupOne.addStudent(value);
            groupTwo.addStudent(value);
        }

        dataString = new ArrayList<String>();
        try {
            dataString = FileParser.ListParser(teachersPatch);
            for (String value : dataString) {
                String[] tempStr = FileParser.StringParser(value);
                listTeacher.add(new Teacher(tempStr[0],                                 //name
                                            tempStr[1],                                 //lastname
                                            Integer.parseInt(tempStr[2]),               //age
                                            new Address(tempStr[3],                     //city
                                                        tempStr[4],                     //street
                                                        Integer.parseInt(tempStr[5]),   //building
                                                        Integer.parseInt(tempStr[6])    //flat
                                            )));
            }
        } catch (FileCheckException e) {
            System.out.println(e.getMessage());//e.printStackTrace();
        }
        groupOne.setTeacher(listTeacher.get(0));//куратор группы задан
        groupTwo.setTeacher(listTeacher.get(1));//куратор группы задан

        if (TeacherToMetodist.nullPtrCheck(listTeacher.get(0))) {
            senior = convTeachToMet.convert(listTeacher.get(0));//конвертер через лямбду выше
        }

    }
}
