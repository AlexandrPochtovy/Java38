package com.company;
/*Ввести с консоли n целых чисел. На консоль вывести:
Все трехзначные числа, в десятичной записи которых нет одинаковых цифр.
 */
import java.util.Scanner;

public class Task6D {
	public static void main (String[] args) {
		String str1;
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
		
		str1 = "found > ";
		for (int i = 0; i < len; i++) {
			int d = num[i] % 10;
			int c = ((num[i] - d) / 10) % 10;
			int t = (num[i] - c - d) / 100;
			if ((num[i] > 99) & (num[i] < 1000) &
				(d != c) & (c != t) & (t != d))
			{
				str1 += num[i];
				str1 += " ";
			}
		}
		System.out.println(str1);
	}
}