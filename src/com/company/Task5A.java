package com.company;

import java.util.Scanner;
/*
* Приветствовать любого пользователя при вводе его имени через командную строку
 * */
public class Task5A {
	public static void main (String[] args) {
		String tempStr = "Hello, what's your name?";//
		System.out.println(tempStr);
		Scanner sc = new Scanner(System.in);
		tempStr = sc.nextLine();
		tempStr = "Nice to meet you, " + tempStr;
		System.out.println(tempStr);
		tempStr = "Java has found you!";
		char byff[] = tempStr.toCharArray();
		try {
			for (int i = 0; i < tempStr.length(); i++) {
				Thread.sleep(100);
				System.out.print(byff[i]);
			}
		} catch (Exception e) {
			System.out.println("Detect some error!");
		}
	}
}