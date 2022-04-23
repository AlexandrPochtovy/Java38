package com.company;
/*Ввести с консоли n целых чисел. На консоль вывести:
Четные и нечетные числа.
*/
import java.util.Scanner;

public class Task6A {
	public static void main (String[] args) {
		String str1, str2;
		int num[];
		str1 = "Hello, enter array size > ";
		System.out.print(str1);
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		num = new int[len];
		System.out.println();
		str1 = "Enter numbers step by step";
		System.out.println(str1);
		for (int i = 0; i < len; i++) {
			num[i] = sc.nextInt();
		}
		System.out.println("OK");
		str1 = "even numbers > ";
		str2 = "not even numbers > ";
		for (int i = 0; i < len; i++) {
			if ((num[i] % 2) == 0) {
				str1 += num[i];
				str1 += " ";
			}
			else {
				str2 += num[i];
				str2 += " ";
			}
		}
		System.out.println(str1);
		System.out.println(str2);
	}
}