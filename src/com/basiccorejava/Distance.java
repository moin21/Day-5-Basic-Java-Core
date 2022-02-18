package com.basiccorejava;
import java.lang.Math;
import java.util.Scanner;

public class Distance {
	public static void main(String[] args) {
		System.out.println("Enter the x- coordinate");
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		System.out.println("Enter the y- coordinate");
		int y = input.nextInt();
		distanceCalculation(x, y);
	}
	public static void distanceCalculation(int x, int y) {
		double distance = Math.sqrt(x*x + y*y);
		System.out.println("Distance of this point from origin is "+distance);
	}
}
