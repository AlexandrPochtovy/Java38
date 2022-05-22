package test;

import com.company.model.Address;
import com.company.model.Student;
import com.company.model.Teacher;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TeacherTest {
    final String name = "name";
    final String lastname = "lastname";
    final int age = 1;
    final String city = "city";
    final String street = "street";
    final int building = 1;
    final int flat = 1;
    final double money = 2.0;
    final int studentCount = 10;
    Address addr;
    Teacher teacher;

    @Before
    public void setUp() throws Exception {
        addr = new Address(city, street, building, flat);
        teacher = new Teacher(name, lastname, age, addr, money, studentCount);
    }

    @After
    public void tearDown() throws Exception {
        addr = null;
        teacher = null;
    }

    @Test
    public void getStudentCount() {
        assertEquals("students count get error", studentCount, teacher.getStudentCount());
    }

    @Test
    public void setStudentCount() {
        int count = 12;
        teacher.setStudentCount(count);
        assertEquals("set students count error", teacher.getStudentCount(), count);
    }

    @Test
    public void getMoney() {
        assertTrue("get money error", money == teacher.getMoney());
    }

    @Test
    public void setMoney() {
        double value = 13.5;
        teacher.setMoney(value);
        assertTrue("set money error", value == teacher.getMoney());
    }

    @Test
    public void salary() {
        int day = 2;
        int count = 3;
        double koeff = 4.5;
        double result1 = day * count * koeff;
        double result2 = day * this.studentCount * koeff;
        assertTrue("salary calculate incorrect", result1 == teacher.salary(day, count, koeff));
        assertTrue("salary calculate incorrect", result2 == teacher.salary(day, koeff));
    }

}