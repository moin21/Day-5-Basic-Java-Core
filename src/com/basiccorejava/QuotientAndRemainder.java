package com.basiccorejava;

import java.util.Scanner;

public class QuotientAndRemainder {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number which you want to Divide");
		int no = scanner.nextInt();
		System.out.println("Enter value of Divisor");
		int div = scanner.nextInt();
		scanner.close();
		quotientAndRemainderFinding(no, div);
	}

	public static void quotientAndRemainderFinding(int no, int div) {
		int quotient = no / div;
		int remainder = no % div;
		System.out.println("When "+no+" is devided by "+div+", quotient is "+quotient+" and remainder is "+remainder+".");
	}
}
