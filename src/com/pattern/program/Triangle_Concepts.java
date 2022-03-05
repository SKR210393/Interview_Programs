package com.pattern.program;

public class Triangle_Concepts {

	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) {

			for (int j = 1; j <= 3; j++) {

				System.out.print(j + " ");
			}
			System.out.println();
		}

		for (int i = 1; i <= 3; i++) {

			for (int j = 3; j >= 1; j--) {
				System.out.print(j + " ");
			}

			System.out.println();
		}

		for (int a = 1; a <= 10; a++) {
			for (int b = 1; b <= a; b++) {
				System.out.print(b + " ");
			}
			System.out.println();
		}

		for (int c = 10; c >= 1; c--) {

			for (int d = 1; d <= c; d++) {
				System.out.print(d + " ");
			}

			System.out.println();
		}

		for (int e = 1; e <= 3; e++) {

			for (int f = 1; f <= 3; f++) {

				System.out.print(e + " ");
			}
			System.out.println();
		}

		for (int g = 1; g <= 5; g++) {
			for (int h = 1; h <= 5; h++) {
				System.out.print("1" + " ");
			}
			System.out.println();
		}

	}

}
