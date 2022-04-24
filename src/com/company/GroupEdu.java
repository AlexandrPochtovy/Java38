package com.company;

public class GroupEdu {
    private String title;
    private int course;
    private Teacher curator;
    private Student student;
    //конструктор   -------------------------------------------------------------------------
    //группа без студентов и куратора
    public GroupEdu(String title, int course) {
        this.title = title;
        this.course = course;
        this.student = null;
        this.curator = null;
    }
    //группа c куратором без студента
    public GroupEdu(String title, int course, Teacher teacher) {
        this.title = title;
        this.course = course;
        this.curator = teacher;
        this.student = null;
    }
    //Группа со студентом без куратора
    public GroupEdu(String title, int course, Student student) {
        this.title = title;
        this.course = course;
        this.student = student;
        this.curator = null;
    }
    //группа создается полностью
    public GroupEdu(String title, int course, Teacher curator, Student student) {
        this.title = title;
        this.course = course;
        this.curator = curator;
        this.student = student;
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
    //функции для студента  -------------------------------------------------------------
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    //смена адреса студента и куратора внутри группы    ---------------------------------------------------------
    public void changeAddressStudent(Student student, Address addr) {
        this.student.setAddr(addr);
    }
    public void changeAddressTeacher(Teacher curator, Address addr) {
        this.curator.setAddr(addr);
    }
}
