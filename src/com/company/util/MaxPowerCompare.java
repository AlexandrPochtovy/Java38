package com.company.util;
import com.company.model.Car;

import java.util.Comparator;

public class MaxPowerCompare implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        if (o1.getPower() > o2.getPower()) {
            return 1;
        } else if (o1.getPower() < o2.getPower()) {
            return -1;
        } else return 0;
    }

}
