package com.company;
/*Ввести с консоли n целых чисел. На консоль вывести:
Наибольшее и наименьшее число.
*/
import java.util.Scanner;

public class Task6B {
	public static void main (String[] args) {
		String str1;
		int min = 0, max = 0;
		str1 = "Hello, enter array size > ";
		System.out.print(str1);
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		System.out.println();
		str1 = "Enter numbers step by step";
		System.out.println(str1);
		for (int i = 0; i < len; i++) {
			int num = sc.nextInt();
			if (i == 0) {
				min = num; 
				max = num;
			}
			else {
				if (num > max) {max = num;}
				if (num < min) {min = num;}
			} 
		}
		System.out.println("OK");
		System.out.println("max value = " + max);
		System.out.println("min value = " + min);
	}
}