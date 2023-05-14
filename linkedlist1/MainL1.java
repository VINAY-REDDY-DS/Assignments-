package com.jlc.secondtagupproject.linkedlist1;

import java.util.Iterator;
import java.util.LinkedList;

public class MainL1 {

	public static void main(String[] args) {

		LinkedList<Integer> l1 = new LinkedList<Integer>();
		l1.add(50);
		l1.add(200);
		l1.add(540);
		l1.add(620);
		l1.add(100);
		l1.add(75);
		l1.add(30);

		System.out.println("-----Using forEach loop-----");
		for (int num : l1)
			System.out.println(num);

		System.out.println("-----Using Iterator-----");
		Iterator<Integer> itr = l1.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());

	}

}
