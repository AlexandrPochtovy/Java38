package test;

import com.company.exception.AgeLimitException;
import com.company.model.Address;
import com.company.model.Student;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {
    final String name = "name";
    final String lastname = "lastname";
    final int age = 1;
    final String city = "city";
    final String street = "street";
    final int building = 1;
    final int flat = 1;
    Address addr;
    Student student;

    @Before
    public void setUp() throws Exception {
        addr = new Address(city, street, building, flat);
        student = new Student(name, lastname, age, addr);
    }

    @After
    public void tearDown() throws Exception {
        addr = null;
        student = null;
    }

    @Test
    public void getName() {
        assertEquals("name get error", name, student.getName());
    }

    @Test
    public void setName() {
        student.setName("testname");
        assertEquals("set name error", student.getName(), "testname");
    }

    @Test
    public void getLastname() {
        assertEquals("lastname get error", lastname, student.getLastname());
    }

    @Test
    public void setLastname() {
        student.setLastname("testlastname");
        assertEquals("set lastname error", student.getLastname(), "testlastname");
    }

    @Test
    public void getAge() {
        assertEquals("age get error", age, student.getAge());
    }

    @Test
    public void setAge() {
        try {
            student.setAge(age);
            assertEquals("set age error", student.getAge(), age);
        } catch (AgeLimitException e) {
            throw new RuntimeException(e);
        }

    }

    @Test
    public void getAddr() {
        assertEquals("address set error", addr, student.getAddr());
    }

    @Test
    public void setAddr() {
        Address testAddr = new Address("testCity", "testStreet", 123, 456);
        student.setAddr(testAddr);
        assertEquals("address set error", student.getAddr(), testAddr);
    }

    @Test
    public void compareTo() {
        //TODO
    }
}