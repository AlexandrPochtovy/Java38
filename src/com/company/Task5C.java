package com.company;

import java.util.Scanner;
import java.lang.Math;

public class Task5C{
	public static void main (String[] args) {
		String tempStr = "Enter number ";//
		System.out.print(tempStr);
		Scanner sc = new Scanner(System.in);//read number
		int num = sc.nextInt();
		System.out.println("Output random numbers to monoline:");
		for (int i = 0; i < num; i++) {
			//Thread.sleep(200);
			System.out.print(" " + Math.random());
		}
		System.out.println();System.out.println();
		System.out.println("Output random numbers to separate lines:");
		for (int i = 0; i < num; i++) {
			//Thread.sleep(200);
			System.out.println(" " + Math.random());
		}
	}
}