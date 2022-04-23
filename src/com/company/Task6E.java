package com.company;
/*Ввести с консоли n целых чисел. На консоль вывести:
Отсортированные числа в порядке возрастания и убывания.
 */
import java.util.Scanner;
import java.util.*;

public class Task6E {
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
		Arrays.sort(num);
		str1 = "Sort ascending > ";
		System.out.print(str1);
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		str1 = "Sort descending > ";
		System.out.print(str1);
		for (int i = len-1; i >= 0; i--) {
			System.out.print(num[i] + " ");
		}
	}
}