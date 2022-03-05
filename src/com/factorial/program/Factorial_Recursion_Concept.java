package com.factorial.program;

public class Factorial_Recursion_Concept {

	public static int factorial(int n) {
		if (n == 0)
		return n = 1;
		
		else
		return(n*factorial(n-1));
		
		}
	
	public static void main (String arfgs []) {
		
		int i, fact = 1;
		int number = 5;
		fact = factorial(number);
		
		System.out.println(fact);
	}
	}

