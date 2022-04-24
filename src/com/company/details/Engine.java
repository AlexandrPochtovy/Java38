package com.company.details;

public class Engine {
    public final String manufacturer;
    private int power;

    public Engine(String manufacturer, int power) {
    this.manufacturer = manufacturer;
                this.setPower(power);
    }

        public int getPower() {
            return this.power;
        }

        public void setPower(int power) {
            this.power = power > 0 ? power : 0;
        }

        public String toString() {
            String s = "Engine: manufacturer='" + this.manufacturer + "', power=" + this.power + " ";
            return s;
        }
    }
