package com.basiccorejava;

import java.util.Scanner;

public class LargestAmongThreeNo {

	public static void main(String args[]) {
		int num1, num2, num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st no.");
		num1 = sc.nextInt();
		System.out.println("Enter 2nd no.");
		num2 = sc.nextInt();
		System.out.println("Enter 3rd no.");
		num3 = sc.nextInt();
		sc.close();
		findingLargest(num1, num2, num3);

	}

	public static void findingLargest(int num1, int num2, int num3) {

		if (num1 >= num2 && num1 >= num3) {
			System.out.println(num1 + " is biggest among them.");
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println(num2 + " is biggest among them.");
		} else {
			System.out.println(num3 + " is biggest among them.");
		}
	}

}
