package com.basiccorejava;

import java.util.Scanner;

public class TwoDimentionalArray {
	public static int m, n, o;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of rows in arrays");
		m = sc.nextInt();
		System.out.println("Enter no. of columns in arrays");
		n = sc.nextInt();
		System.out.println("Assign a value to the last column of the last row");
		o = sc.nextInt();
		sc.close();
		System.out.println("Welcome to this program, We will create and print 2D arrays");
		intArrayWorking(m, n);
	}

	public static void intArrayWorking(int m, int n) {
		System.out.println("Assign a value to the " + n + "th column of the " + n + "th row.");
		int[][] integer2DArray = new int[m][n];
		integer2DArray[m - 1][n - 1] = o;
		System.out.println(integer2DArray[m - 1][n - 1]);

	}

}
