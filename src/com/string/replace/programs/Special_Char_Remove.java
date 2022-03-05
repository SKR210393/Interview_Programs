package com.string.replace.programs;

public class Special_Char_Remove {

	public static void main (String [] args) {
		String sc = " I@t# i@s*&*&F&^^*&in*&*^*&(e";
		sc = sc.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(sc);

	}
}
