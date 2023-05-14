package com.jlc.secondtagupproject.set4;

import java.util.HashSet;

public class MainS4 {

	public static void main(String[] args) {

		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("vinay");
		hashSet.add("mom");
		hashSet.add("tenet");
		hashSet.add("malayalam");
		hashSet.add("good");
		hashSet.add("bad");

		System.out.println(hashSet);
		HashSet<String> hashSet2 = new HashSet<String>();

		for (String s : hashSet) {
			if (isPallindrome(s)) {
				hashSet2.add(s);
			}
		}

		System.out.println("\nOnly Pallindrome : \n" + hashSet2);
	}

	public static boolean isPallindrome(String s) {
		String reversed = new StringBuilder(s).reverse().toString();
		return s.equals(reversed);
	}

}
