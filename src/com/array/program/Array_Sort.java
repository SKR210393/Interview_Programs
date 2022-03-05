package com.array.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Array_Sort {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<Integer>();

		List<Integer> l1 = new ArrayList<Integer>();

		l.add(1);
		l.add(0);
		l.add(4);
		l.add(5);
		l.add(2);

		l1.add(7);
		l1.add(10);
		l1.add(8);
		l1.add(6);
		l1.add(3);
		l1.add(12);

		l.set(1, 9);
		l1.set(5, 11);
		l.addAll(l1);
		
		Collections.sort(l);

		for (Integer i : l) {
			System.out.println(i);
		}

		Collections.reverse(l);
		for (Integer iDesc : l) {
			System.out.println(iDesc);
		}
	}

}
