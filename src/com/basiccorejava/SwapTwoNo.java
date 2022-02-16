package com.basiccorejava;

import java.util.*;

class SwapTwoNo {
	public static int x, y, z;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of X");
		x = sc.nextInt();
		System.out.println("Enter the value of X");
		y = sc.nextInt();
		sc.close();
		swappingNo(x, y, z);
		
	}
	public static void swappingNo(int x, int y, int z) {
		System.out.println("before swapping " + x + ", " + y);
		z = x;
		x = y;
		y = z;
		System.out.println("After swapping: " + x + ", " + y);
	}
}
