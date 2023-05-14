package com.jlc.secondtagupproject.set5;

import java.util.LinkedHashSet;

public class MainS4 {

	public static void main(String[] args) {

		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		linkedHashSet.add(1);
		linkedHashSet.add(2);
		linkedHashSet.add(3);
		linkedHashSet.add(4);
		linkedHashSet.add(5);
		linkedHashSet.add(6);

		System.out.println(linkedHashSet);
		int sum=0;
		for (int num : linkedHashSet) {
			if (num % 2 == 0) {
				sum+=num;
			}
		}
		System.out.println("Sum of Even numbers in the given list :\n"+sum);

	}

}
