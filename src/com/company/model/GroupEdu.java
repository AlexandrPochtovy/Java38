package com.company.model;

import com.company.model.Student;
import com.company.model.Teacher;
import com.company.model.Address;
import com.company.base.Person;
import java.util.ArrayList;

public class GroupEdu {
    private String title;
    private int course;
    private Teacher teacher;
    private ArrayList<Student> students;

    //конструктор   -------------------------------------------------------------------------
    //группа без студентов и куратора
    public GroupEdu(String title, int course) {
        this.title = title;
        this.course = course;
        this.students = new ArrayList<Student>();
        this.teacher = null;
    }

    //группа c куратором без студента
    public GroupEdu(String title, int course, Teacher teacher) {
        this.title = title;
        this.course = course;
        this.teacher = teacher;
        this.students = new ArrayList<Student>();
    }

    //группа без куратора без студентов с резервом памяти для студентов
    public GroupEdu(String title, int course, int studentsSize) {
        this.title = title;
        this.course = course;
        this.students = new ArrayList<Student>(studentsSize);
        this.teacher = null;
    }

    //группа создается полностью
    public GroupEdu(String title, int course, Teacher curator, int studentsSize) {
        this.title = title;
        this.course = course;
        this.teacher = curator;
        this.students = new ArrayList<Student>(studentsSize);
    }

    public GroupEdu(String title, int course, Teacher teacher, ArrayList<Student> students) {
        this.title = title;
        this.course = course;
        this.teacher = teacher;
        this.students = students;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course > 0) {
            this.course = course;
        } else this.course = 1;//при неверном вводе задаем первый курс
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void addStudent(Student student, int position) {
        this.students.add(position, student);
    }

    public Student getStudent() {
        return this.students.get(0);
    }

    public Student getStudent(int index) {
        return this.students.get(index);
    }

    public void deleteStudent() {
        int position = this.students.size() - 1;
        this.students.remove(position);
    }

    public void deleteStudent(int position) {
        this.students.remove(position);
    }

    public void AddressChange(Person person, Address addr) {
        person.setAddr(addr);
    }
}
