package com.basiccorejava;

import java.util.Scanner;

public class SumOfTripletsZero {

	public static int n;

	public static void main(String[] args) {

		int[] arr = creatingArrayofInputs(n);
		/*
		 * return value of creatingArrayofInputs is assigned to a array variable to be
		 * used as parameter for creatingTriplets
		 */
		creatingTriplets(arr);

	}

	/*
	 * Method to create array from user input.
	 */
	public static int[] creatingArrayofInputs(int n) {
		Scanner input = new Scanner(System.in);
		// Read user input.
		System.out.println("How many numbers do you want to enter?");
		int num = input.nextInt();
		int array[] = new int[num];
		System.out.println("Enter the " + num + " numbers now.");
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();

		}

		return array;

	}

	/*
	 * Method to create triplets from creatingArrayofInputs method's array output.
	 */
	public static void creatingTriplets(int[] arr) {
		int n = arr.length;
		boolean found = false;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						System.out.print(arr[i]);
						System.out.print(" ");
						System.out.print(arr[j]);
						System.out.print(" ");
						System.out.print(arr[k]);
						System.out.print("\n");
						found = true;
					}
				}
			}
		}

		/*
		 * If no triplet with 0 sum found in array
		 */
		if (found == false) {
			System.out.println("No triplet exists with a total sum zero");
		}

	}
}
