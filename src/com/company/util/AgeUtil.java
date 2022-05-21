package com.company.util;

import com.company.exception.AgeLimitException;

public class AgeUtil {
    public static final int ageLow = 0;
    public static final int ageHi = 120;
    public static void checkAge(int age) throws AgeLimitException {
        if ((age < ageLow) || (age > ageHi)) {
            throw new AgeLimitException("Age value invalid!");
        }
    }
}
