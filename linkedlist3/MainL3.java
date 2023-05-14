package com.jlc.secondtagupproject.linkedlist3;

import java.util.Collections;
import java.util.LinkedList;

public class MainL3 {

	public static void main(String[] args) {

		LinkedList<String> l1 = new LinkedList<String>();
		l1.add("bus");
		l1.add("car");
		l1.add("truck");
		l1.add("ship");
		l1.add("cycle");
		l1.add("bike");
		l1.add("train");

		System.out.println("Normal list :\n" + l1);

		Collections.reverse(l1);

		System.out.println("\n\nReversed list :\n" + l1);

	}

}
