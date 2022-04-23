package com.company;
/*Ввести пароль из командной строки и сравнить его со строкой-образцом.*/
import java.util.Scanner;

public class Task5D {
	public static void main (String[] args) {
		String pass = "pas$word", str = "Enter password > ";
		System.out.print(str);
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		if (pass.equals(str)) {
			System.out.println("Verification. Access is allowed.");
		}
		else {
			System.out.println("Wrong password. Access is denied.");
		}
			
	}
}