package com.company;
/*Вывести фамилию разработчика, дату и время начала выполнения программы, а также дату и время завершения выполнения.
*/
import java.util.Scanner;
import java.util.Date;

public class Task5F {
	public static void main (String[] args) {
		Date now = new Date();//get actual time
		String tempStr;
		tempStr = "Time start " + now.toString();
		System.out.println(tempStr);
		tempStr = "Author: Alexander Pochtovy";
		char byff[] = tempStr.toCharArray();
		try {
			for (int i = 0; i < tempStr.length(); i++) {
				Thread.sleep(100);
				System.out.print(byff[i]);
			}
			System.out.println();
		} catch (Exception e) {
			System.out.println("Detect some error!");
		}
		now = new Date();
		tempStr = "Time stop " + now.toString();
		System.out.println(tempStr);	
	}
}