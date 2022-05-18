package com.company.userdatatype;

import com.company.exceptions.AgeLimitException;
import com.company.util.AgeUtil;

public abstract class Person implements Comparable<Person>{
    private String name;
    private String lastname;
    private int age;
    private Sex sex;
    private Address addr;
//===================================================================================
public Person(String name, String lastname) {
    this.name = name;
    this.lastname = lastname;
    this.age = 0;
    this.addr = null;
}
    public Person(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        try {
            setAge(age);
        } catch (AgeLimitException e) {
            e.printStackTrace();
        }
        this.addr = null;
    }

    public Person(String name, String lastname, int age, Address addr) {
        this.name = name;
        this.lastname = lastname;
        try {
            setAge(age);
        } catch (AgeLimitException e) {
            e.printStackTrace();
        }
        this.addr = addr;
    }
//===================================================================================
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgeLimitException {
        try {
            AgeUtil.checkAge(age);
            this.age = age;
        }
        catch (AgeLimitException e){
            System.out.println(e.getMessage());
            this.age = 0;
        }
    }

    public Address getAddr() {
        return addr;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        final String s = " name " + name +
                        " lastname " + lastname +
                        " age " + age + " " +
                        addr.toString();
        return s;
    }

    @Override
    public int compareTo(Person o) {
        int res;
        res = this.name.compareTo(o.getName());
        if (res != 0) {
            return res;
        } else {
            res = this.lastname.compareTo(o.getLastname());
            if (res != 0) {
                return res;
            } else {
                if (this.age > o.getAge()) {
                    return 1;
                } else if (this.age < o.getAge()) {
                    return -1;
                } else return 0;
            }
        }
    }
}
