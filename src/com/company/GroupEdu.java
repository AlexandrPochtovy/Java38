package com.company;

public class GroupEdu {
    private String title;
    private int course;
    private Teacher curator;
    private Student[] students;
    //конструктор   -------------------------------------------------------------------------
    //группа без студентов и куратора
    public GroupEdu(String title, int course) {
        this.title = title;
        this.course = course;
        this.students = null;
        this.curator = null;
    }
    //группа c куратором без студента
    public GroupEdu(String title, int course, Teacher teacher) {
        this.title = title;
        this.course = course;
        this.curator = teacher;
        this.students = null;
    }
    //группа без куратора без студентов с резервом памяти для студентов, т.е. создаем объект массив но не наполняем
    public GroupEdu(String title, int course, int studentsSize) {
        this.title = title;
        this.course = course;
        this.students = new Student[studentsSize];
        this.curator = null;
    }
    //группа создается с куратором без студентов с резервом памяти
    public GroupEdu(String title, int course, Teacher curator, int studentsSize) {
        this.title = title;
        this.course = course;
        this.curator = curator;
        this.students = new Student[studentsSize];
    }
    //группа создается полностью
    public GroupEdu(String title, int course, Teacher curator, Student[] students) {
        this.title = title;
        this.course = course;
        this.curator = curator;
        this.students = new Student[students.length];
        this.students = students;
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
    public Student[] getStudent() {
        return students;
    }
    //добавляет в конец массива
    public void addStudent (Student student) {
        int len = this.students.length;
        Student[] buff = new Student[len + 1];
        buff[len] = student;
        this.students = buff;
    }
    //добавляет в указанное место
    public int addStudent (Student student, int position) {
        int len = this.students.length;
        if ((position <= len) & (position >= 0)) {
            Student[] buff = new Student[len + 1];
            buff = this.students;
            for (int i = buff.length-1; i > position; i--) {
                buff[i] = buff[i-1];
            }
            buff[position] = student;
            this.students = buff;
            return 1;
        }
        else {
            return -1;
        }
    }
    //удаляет из конца массива
    public void deleteStudent() {
        int len = this.students.length;
        Student[] buff = new Student[len - 1];
        for (int i = 0; i < buff.length; i++) {
            buff[i] = this.students[i];
        }
        this.students = buff;
    }
    //удаляет из указанного места
    public void deleteStudent(int position) {
        int len = this.students.length;
        Student[] buff = new Student[len - 1];
        for (int i = position; i < this.students.length - 1; i++) {
            this.students[i] = this.students[i+1];
        }
        this.students = buff;
    }

    //смена адреса студента и куратора внутри группы    ---------------------------------------------------------
    public void AddressChange(Person person, Address addr) {
        person.setAddr(addr);
    }
}
