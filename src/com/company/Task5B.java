package com.company;

import java.util.Scanner;

public class Task5B {
	public static void main (String[] args) {
		String tempStr = "Print any string...";//
		System.out.println(tempStr);
		Scanner sc = new Scanner(System.in);
		tempStr = sc.nextLine();
		char byff[] = tempStr.toCharArray();
		System.out.println("Mirror string: ");
		int len = tempStr.length();
		try {
			for (int i = len; i > 0; i--) {
				Thread.sleep(200);
				System.out.print(byff[i-1]);
			}
		} catch (Exception e) {
			System.out.println("Detect some error!");
		}
	}
}