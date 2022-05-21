package com.company;

import com.company.util.converters.ConvertMetodist;
import com.company.util.converters.ConvertTeacher;
import com.company.model.*;
import com.company.util.FileParser;

import java.util.ArrayList;

public class Main {
    private static final String studentsPatch = "students.txt";//путь к файлу списка студентов
    private static final String teachersPatch = "teachers.txt";//путь к файлу списка учителей
    private static final String metodistsPatch = "metodists.txt";//путь к файлу списка методистов

    public static void main(String[] args) {
        Metodist senior = null;
        Teacher teacherOne;
        //две группы, сейчас будем заполнять их судентами и кураторами
        GroupEdu groupOne = new GroupEdu("Management", 1);
        GroupEdu groupTwo = new GroupEdu("Business", 2);

        ArrayList<Teacher> listTeacher = new ArrayList<Teacher>();

        //парсим список студентов
        ArrayList<String> dataString = new ArrayList<String>();
            dataString = FileParser.ListParser(studentsPatch);//создан массив строк из файла
            for (String value : dataString) {
                /*теперь каждую строку из массива разбили на массив отдельных строк
                 * и каждый элемент-строку занесли в данные конструктора студента*/
                String[] tempStr = FileParser.StringParser(value);
                Student tempSt = new Student(tempStr[0],                                     //name
                        tempStr[1],                                     //lastname
                        Integer.valueOf(tempStr[2], 10),          //age
                        new Address(tempStr[3],                         //city
                                tempStr[4],                         //street
                                Integer.valueOf(tempStr[5], 10),  //building
                                Integer.valueOf(tempStr[6], 10)   //flat
                        ));
                groupOne.addStudent(tempSt);//студентов распарсили, заполняем группу
                groupTwo.addStudent(tempSt);//студентов распарсили, заполняем группу
            }
        dataString = new ArrayList<String>();
            dataString = FileParser.ListParser(teachersPatch);
            for (String value : dataString) {
                String[] tempStr = FileParser.StringParser(value);
                listTeacher.add(new Teacher(tempStr[0],                                 //name
                        tempStr[1],                                 //lastname
                        Integer.valueOf(tempStr[2]),               //age
                        new Address(tempStr[3],                     //city
                                tempStr[4],                     //street
                                Integer.valueOf(tempStr[5]),   //building
                                Integer.valueOf(tempStr[6])    //flat
                        )));
            }

        if (listTeacher.size() >=2 ) {
            groupOne.setTeacher(listTeacher.get(0));//куратор группы 1 задан
            groupTwo.setTeacher(listTeacher.get(1));//куратор группы 2 задан

            ConvertTeacher convT = new ConvertTeacher();
            senior = convT.convert(listTeacher.get(0));//конвертер через лямбду
            senior.setAllTeachers(listTeacher);

            ConvertMetodist convM = new ConvertMetodist();
            teacherOne = convM.convert(senior);//конвертер через лямбду
        }
    }
}
