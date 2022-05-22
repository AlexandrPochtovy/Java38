package com.company;

import com.company.util.converters.ConvertMetodist;
import com.company.util.converters.ConvertTeacher;
import com.company.model.*;
import com.company.util.FileParser;

import java.io.File;
import java.util.ArrayList;

public class Main {
    private static final String studentsPatch = "students.txt";//путь к файлу списка студентов
    private static final String teachersPatch = "teachers.txt";//путь к файлу списка учителей
    private static final String metodistsPatch = "metodists.txt";//путь к файлу списка методистов

    public static void main(String[] args) {
        Metodist senior = null;//методист
        Teacher teacherOne;//завуч
        //две группы, сейчас будем заполнять их судентами и кураторами
        GroupEdu groupOne = new GroupEdu("Management", 1);//группа 1
        GroupEdu groupTwo = new GroupEdu("Business", 2);//группа 1

        ArrayList<Teacher> listTeacher = new ArrayList<Teacher>();

        //парсим список студентов
        ArrayList<String> dataString = new ArrayList<String>();//список строк из файла
            dataString = FileParser.ListParser(studentsPatch);//создан массив строк из файла
            for (String value : dataString) {
                /*теперь каждую строку из массива разбили на массив отдельных строк
                 * и каждый элемент-строку занесли в данные конструктора студента*/
                String[] tempStr = FileParser.StringParser(value);
                groupOne.addStudent(FileParser.CreateStudent(tempStr));//студентов распарсили, заполняем группу
                groupTwo.addStudent(FileParser.CreateStudent(tempStr));//студентов распарсили, заполняем группу
            }
        dataString = new ArrayList<String>();//список строк из файла переопределен
            dataString = FileParser.ListParser(teachersPatch);
            for (String value : dataString) {
                String[] tempStr = FileParser.StringParser(value);
                listTeacher.add(FileParser.CreateTeacher(tempStr));//заполняем список учителей
            }

        if (listTeacher.size() >=2 ) {//проверяем что в списке хватает учителей для групп
            groupOne.setTeacher(listTeacher.get(0));//куратор группы 1 задан
            groupTwo.setTeacher(listTeacher.get(1));//куратор группы 2 задан

            ConvertTeacher convT = new ConvertTeacher();
            senior = convT.convert(listTeacher.get(0));//конвертер через лямбду
            senior.setTeachers(listTeacher);//задаем у методиста его список учителей

            ConvertMetodist convM = new ConvertMetodist();
            teacherOne = convM.convert(senior);//конвертер через лямбду
        }
    }
}
