package com.company.util;

import com.company.exception.WrongLoginException;
import com.company.exception.WrongPasswordException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PassValidate {
    private static String mask = "[^a-zA-Z_0-9]+";//хотя бы раз ни один из этих символов
    private static Pattern pt = Pattern.compile(mask);

    public static boolean passCheck (String login, String password, String confirmPassword) {
        try {
            checkLogin(login);
            checkPass(password);
            checkPass(confirmPassword);
            if (password.equals(confirmPassword)) {
                return true;
            } else return false;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static void checkLogin(String login) throws WrongLoginException {
        Matcher search = pt.matcher(login);
        if ((login.length() > 20) || (search.find())) {
            throw new WrongLoginException("wrong login");
        }
    }
    public static void checkPass(String pass) throws WrongPasswordException {
        Matcher search = pt.matcher(pass);
        if ((pass.length() > 20) || (search.find())) {
            throw new WrongPasswordException("wrong password");
        }
    }
}
