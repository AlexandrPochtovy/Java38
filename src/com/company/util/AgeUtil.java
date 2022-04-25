package com.company.util;

import com.company.exeption.AgeExeption;
import com.company.exeption.OldExeption;
import com.company.exeption.YangExeption;

public class AgeUtil {

    public static void checkAge(int age) {
        try {
            if (age < 16) {
                throw new YangExeption("маленький возраст");
            }
            if (age > 80) {
                throw new OldExeption("Нереальный возраст");
            }
        } catch (Exception ye) {
            ye.printStackTrace();
            System.out.println(ye.getMessage());
        }
        finally {
            System.out.println("конец");
        }



    }
}
