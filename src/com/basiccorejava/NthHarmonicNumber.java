package com.basiccorejava;

import java.util.Scanner;

public class NthHarmonicNumber {
	public static void main(String[] args) {
		System.out.println("Enter value of N to print Harmonic Sequence and it's Sum:");
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		scanner.close();
		calculation(N);

	}

	public static void calculation(int n) {
		double i = 1, sum = 0.0, nthTerm =1;;
		for (i = 1; i <= n; i++) {
			nthTerm = 1 / i;
			sum = sum + nthTerm;

		}
		System.out.println("Nth term of this sequence is " + nthTerm + ". Sum of this sequence is:" +sum+".");
		
	}
}
