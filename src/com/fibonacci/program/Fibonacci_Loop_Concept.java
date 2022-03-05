package com.fibonacci.program;

public class Fibonacci_Loop_Concept {

	public static void main(String args[]) {

		int n1 = 0;
		int n2 = 1;
		int n3;
		int count = 10;

		System.out.print(n1 + " " + n2);

		// We already printed 0 & 1, So we are starting the loop from 2
		for (int i = 2; i <= count; i++) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;

		}

	}
}
