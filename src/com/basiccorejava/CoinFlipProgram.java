package com.basiccorejava;

import java.util.Scanner;

public class CoinFlipProgram {

	public static void main(String[] args) {
		System.out.println("Welcome to Coin Flip Program!!" + "\n" + "How many times you want to flip the coin?");
		int count;
		Scanner scanner = new Scanner(System.in);
		count = scanner.nextInt();

		scanner.close();

		coinFlip(count);
	}

	public static void coinFlip(int count) {
		int head = 0, tail = 0;
		if (count > 0) {
			for (int i = 0; i < count; i++) {
				double toss = Math.random();
				if (toss < 0.5)
					tail++;
				else
					head++;
			}

		} else {
			System.out.println("Please enter a valid no. of flips");
		}
		double headPercent = (head * 100) / (head + tail);
		double tailPercent = 100 - headPercent;
		System.out.println("There were " + count + " no. of flips. Head Percentage is " + headPercent
				+ " , while Tail Percantage is " + tailPercent + ".");
	}
}