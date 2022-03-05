package com.reverse.string;

import java.util.Scanner;

public class Test_Try1 {

	public static void main(String[] args) {

		String s = "RENNIW";
		String n = "";

		for (int i = s.length() - 1; i >= 0; i--) {

			char charAt = s.charAt(i);
			n = n + charAt;

		}
		System.out.println(n);

		int a, b = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 2nd value");

		int c = sc.nextInt();
		int d = c;

		while (d > 0) {

			a = d % 10; // ---- > 687 -> it will select 7; 68 --> 8; 6 ---> 6;
			b = (b * 10) + a; // ----> b = 0 + 7 = 7; 0 + 8 = 8; 0 + 6 = 6;
			d = d / 10; // ---> d = 687 / 10 = 68; 68 / 10 = 6; 6 / 10 = .6

		}
		System.out.println(b); // ----> 786

		String s2 = "DERAELC";
		String tempNew = ""; // ----> Declare the Empty String with refName
		for (int i = s2.length() - 1; i >= 0; i--) {
			char charAt = s2.charAt(i);
			tempNew = tempNew + charAt; // ---> Add the value in Empty String refName
		}
		System.out.println(tempNew);

//		Reverse String;

		String sp = "EPOH";
		String load = "";

		for (int i = sp.length() - 1; i >= 0; i--) {
			char charAt = sp.charAt(i);
			load = load + charAt;
		}
		System.out.println(load);
		
		int n1, n2 = 0;
		Scanner sc1 = new Scanner(System.in);

		System.out.println("Enter the 2nd value");
		int n3 = sc1.nextInt();
		int n4 = n3;

		while (n4 > 0) {

			n1 = n4 % 10;
			n2 = (n2 * 10) + n1;
			n4 = n4 / 10;
		}
		System.out.println(n2);
	}

}
