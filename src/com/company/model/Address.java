package com.company.model;

public class Address {
    private String city;
    private String street;
    private int building;
    private int flat;

    public Address(String city, String street, int building, int flat) {
        this.city = city;
        this.street = street;
        //this.building = building;
        setBuilding(building);
        //this.flat = flat;
        setFlat(flat);
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }

    public int getBuilding() {
        return building;
    }
    public void setBuilding(int building) {
        if (building > 0) {
            this.building = building;
        } else {
            System.out.println("Building wrong value!");
        }
    }

    public int getFlat() {
        return flat;
    }

    public void setFlat(int flat) {
        if (flat >= 0) {
            this.flat = flat;
        } else {
            System.out.println("Flat wrong value!");
        }
    }

    @Override
    public String toString() {
        return "Address: city '" + city + '\'' +
                ", street '" + street + '\'' +
                ", building " + building +
                ", flat " + flat;
    }
}
