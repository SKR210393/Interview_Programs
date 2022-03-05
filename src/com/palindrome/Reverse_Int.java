package com.palindrome;

import java.util.Scanner;

public class Reverse_Int {

	public static void main(String[] args) {

		int v1, v2 = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");

		int v3 = sc.nextInt();
		int v4 = v3;

		while (v4 > 0) {

			v1 = v4 % 10;
			v2 = (v2 * 10) + v1;
			v4 = v4 / 10;
		}
		System.out.println(v2);

		int n1, n2 = 0;
		int n3 = 341;

		while (n3 > 0) {

			n1 = n3 % 10;
			n2 = (n2 * 10) + n1;
			n3 = n3 / 10;
		}
		System.out.println(n2);
	}

}
