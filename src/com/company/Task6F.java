package com.company;
/*Ввести с консоли n целых чисел. На консоль вывести:
Числа-палиндромы, значения которых в прямом и обратном порядке совпадают
 */
import java.util.Scanner;

public class Task6F {
	public static void main (String[] args) {
		String str1;
		String[] data;
		str1 = "Hello, enter array size > ";
		System.out.print(str1);
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		data = new String[len];
		str1 = "Enter " + len + " numbers step by step";
		System.out.println(str1);
		sc = new Scanner(System.in);
		for (int i = 0; i < len; i++) {	//почему-то вводит на 1 меньше чем требуется и закрывает цикл ((
			data[i] = sc.nextLine();	//при этом если заменить чтение строки на чтение числа то считывает нужное количество
		}
		sc.close();
		System.out.println("OK");
		str1 = "Palindrom : ";
		for (String step : data) {
			boolean check = true;
			char buff[] = step.toCharArray();
			len = buff.length;
			for (int j = 0; j < (len / 2 + 1); j++) {
				if (buff[j] != buff[(len - 1) - j]) { check = false; }
			}
			if (check == true)  {
				str1 += step;
				str1 += " ";
			}
		}
		System.out.println(str1);
	}
}