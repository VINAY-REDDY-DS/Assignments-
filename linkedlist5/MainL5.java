package com.jlc.secondtagupproject.linkedlist5;

import java.util.LinkedList;

public class MainL5 {

	public static void main(String[] args) {

		LinkedList<String> l1 = new LinkedList<String>();
		l1.add("vinay");
		l1.add("naveen");
		l1.add("chaitra");
		l1.add("suresh");
		l1.add("maheshwari");

		System.out.println("Before : " + l1);
		for (int i = 0; i < l1.size(); i++) {
			String s = l1.get(i);
			for (int j = 0; j < s.length(); j++) {
				char ch = s.charAt(j);
				if (ch == 'i') {
					l1.remove(i);
					break;

				}
			}
		}
		System.out.println("After : " + l1);

	}

}
