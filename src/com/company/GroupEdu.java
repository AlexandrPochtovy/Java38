package com.company;

import com.company.peoples.Student;
import com.company.peoples.Teacher;
import com.company.udt.Address;
import com.company.udt.Person;
import java.util.ArrayList;

public class GroupEdu {
    private String title;
    private int course;
    private Teacher curator;
    private ArrayList<Student> students;

    //конструктор   -------------------------------------------------------------------------
    //группа без студентов и куратора
    public GroupEdu(String title, int course) {
        this.title = title;
        this.course = course;
        this.students = new ArrayList<Student>();
        this.curator = null;
    }

    //группа c куратором без студента
    public GroupEdu(String title, int course, Teacher teacher) {
        this.title = title;
        this.course = course;
        this.curator = teacher;
        this.students = new ArrayList<Student>();
    }

    //группа без куратора без студентов с резервом памяти для студентов
    public GroupEdu(String title, int course, int studentsSize) {
        this.title = title;
        this.course = course;
        this.students = new ArrayList<Student>(studentsSize);
        this.curator = null;
    }

    //группа создается полностью
    public GroupEdu(String title, int course, Teacher curator, int studentsSize) {
        this.title = title;
        this.course = course;
        this.curator = curator;
        this.students = new ArrayList<Student>(studentsSize);
    }

    //функции для названия группы  -------------------------------------------------------------
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    //функции для номера курса  -------------------------------------------------------------
    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course > 0) {
            this.course = course;
        }
    }

    //функции для куратора  -------------------------------------------------------------
    public Teacher getCurator() {
        return curator;
    }

    public void setCurator(Teacher curator) {
        this.curator = curator;
    }
    //функции для массива студентов  -------------------------------------------------------------

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    //добавляет в конец массива
    public void addStudent(Student student) {
        this.students.add(student);
    }

    //добавляет в указанное место
    public void addStudent(Student student, int position) {
        this.students.add(position, student);
    }

    //удаляет из конца массива
    public void deleteStudent() {
        int position = this.students.size() - 1;
        this.students.remove(position);
    }

    //удаляет из указанного места
    public void deleteStudent(int position) {
        this.students.remove(position);
    }

    //смена адреса студента и куратора внутри группы    ---------------------------------------------------------
    public void AddressChange(Person person, Address addr) {
        person.setAddr(addr);
    }
}
