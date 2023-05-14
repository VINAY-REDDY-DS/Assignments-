package com.jlc.secondtagupproject.linkedlist6;

import java.util.LinkedList;

public class MainL6 {

	public static void main(String[] args) {

		LinkedList<Integer> l1 = new LinkedList<Integer>();
		l1.add(1);
		l1.add(5);
		l1.add(9);
		l1.add(15);
		l1.add(12);
		l1.add(20);
		l1.add(27);
		l1.add(30);
		l1.add(35);

		System.out.println(l1);
		//Create another linked list to add the elements which are divisible by 3
		LinkedList<Integer> l2 = new LinkedList<Integer>();
		for (int i = 0; i < l1.size(); i++) {

			if (l1.get(i) % 3 == 0)  //div by 3 if true
				l2.add(l1.get(i));   // add elements to list 2

		}

		System.out.println("The numbers which are Divisible by 3 are : " + l2);

	}

}
