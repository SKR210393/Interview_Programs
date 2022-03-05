package com.factorial.program;

public class Factorial_Loop_Concept {


	public static void main(String args[]) {

		int i, fact = 1;

		int number = 6; // ---> It is the number to calculate the factorial

		for (i = 1; i <= number; i++) {
			fact = fact * i;

		}
		System.out.println("Factorical of " + number + " is " + fact);
	
	
	
	
		int j, refName = 1;
		int factorialValue = 5;

		for( j = 1; j <=factorialValue; j++){ 
		refName = refName*j;
		}
		System.out.println("Factorial Value of  "+ factorialValue + " is " + refName);
		}

	}
