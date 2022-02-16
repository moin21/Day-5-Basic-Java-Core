package com.basiccorejava;

import java.util.Scanner;

public class LeapYearCheckerProgram {
	public static void main(String[] args) {
		System.out.println("Welcome to Leap Year Checker Program!!" + "\n" + "Enter a year you want to check:");
		int year;
		Scanner scanner = new Scanner(System.in);
		year = scanner.nextInt();

		scanner.close();
		checkLeapYear(year);
	}

	public static void checkLeapYear(int year) {
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0 && year > 1581))
			System.out.println(year + " is a leap year");
		else
			System.out.println(year + " is not a leap year");
	}
}
