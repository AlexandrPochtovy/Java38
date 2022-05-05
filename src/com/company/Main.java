package com.company;

import com.company.exception.CharException;
import com.company.util.PassValidate;

public class Main {

    public static void main(String[] args) {
	// feature Lesson 9 branch
        String login = "hsdfdf";
        String pass = "qwerty";
        String confirmPAss = "qwerty";
        System.out.print(PassValidate.passCheck(login, pass, confirmPAss));
    }

}
