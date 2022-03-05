package com.palindrome;

import java.util.Scanner;

public class ReverseInt_Palindhrome {

	public static void main(String[] args) {

		int a, b = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");

		int c = sc.nextInt();
		int d = c;

		while (d > 0) {

			a = d % 10;
			b = (b * 10) + a;
			d = d / 10;

		}

		System.out.println("Reverse Value of int is " + b);
	}
}
