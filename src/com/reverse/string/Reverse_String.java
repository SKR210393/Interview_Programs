package com.reverse.string;

public class Reverse_String {


	public static void main (String [] args) {

	String s = "SSAP";
	String temp ="";
	

	for(int i = s.length()-1; i >= 0; i--){
	char charAt = s.charAt(i);
	temp = temp + charAt;

	}

	System.out.println(temp);

	
	} }

