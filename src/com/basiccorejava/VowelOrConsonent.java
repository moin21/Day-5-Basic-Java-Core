package com.basiccorejava;

import java.util.Scanner;

public class VowelOrConsonent {
	public static void main(String[] args) {
		System.out.println("Enter Any Alphabet either in small or capital.");
		Scanner sc = new Scanner(System.in);

		char alphabet = sc.next().charAt(0);
		sc.close();
		vowelOrConsonent(alphabet);

	}

	public static void vowelOrConsonent(char alphabet) {
		switch (alphabet) {
		case 'a':
			System.out.println("It's a vowel");
			break;
		case 'e':
			System.out.println("It's a vowel");
			break;
		case 'i':
			System.out.println("It's a vowel");
			break;
		case 'o':
			System.out.println("It's a vowel");
			break;
		case 'u':
			System.out.println("It's a vowel");
			break;
		default:
			System.out.println("It's a consonant");
			break;
		}
	}
}
