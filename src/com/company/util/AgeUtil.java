package com.company.util;

import com.company.exeption.AgeExeption;
import com.company.exeption.OldExeption;
import com.company.exeption.YangExeption;

public class AgeUtil {

    public static void checkAge(int age) {
        try {
            checkAgeYang(age);
            checkAgeOld(age);
        } catch (AgeExeption e) {
            e.printStackTrace();
        }
    }
    private static void checkAgeYang(int age) throws YangExeption {
        if (age < 16) {
            throw new YangExeption("слишком юный падаван");
        }
    }
    private static void checkAgeOld(int age) throws OldExeption {
        if (age > 80) {
            throw new OldExeption("слишком мудрый старик");
        }
    }
}
