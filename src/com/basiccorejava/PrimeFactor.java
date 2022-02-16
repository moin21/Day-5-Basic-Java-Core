package com.basiccorejava;

import java.util.Scanner;

public class PrimeFactor {
	public static int number;

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to find prime factors");
		number = scanner.nextInt();
		scanner.close();
		factorsFinding(number);

	}

	public static void factorsFinding(int number) {
		for (int i = 2; i <= number; i++) {
			if(number%i==0) {
				System.out.print(i+" ");
				number = number/i;
			}
		}
	}
}
