package com.basiccorejava;

import java.util.Scanner;

public class EvenOrOdd {
	public static int number;
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number you want to check");
		number = sc.nextInt();
		sc.close();
		evenOrOdd();

	}
	public static void evenOrOdd() {
		int remainder = number % 2;
		switch (remainder) {
		case 0:
			System.out.println(number + " is an even number.");
		case 1:
			System.out.println(number + " is an odd number.");
		}
	}
}