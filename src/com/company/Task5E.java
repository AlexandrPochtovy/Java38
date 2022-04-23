package com.company;
/*Ввести целые числа как аргументы командной строки, подсчитать их суммы и произведения. Вывести результат на консоль.
*/
import java.util.Scanner;

public class Task5E {
	public static void main (String[] args) {
		int a, b;
		String str = "Enter ";
		Scanner read = new Scanner(System.in);
		System.out.print(str + "a > ");
		a = read.nextInt();
		System.out.print(str + "b > ");
		b = read.nextInt();
		System.out.println("summa a+b = " + (a+b));
		System.out.println("multiplication a*b = " + (a*b));
	}
}