package com.jlc.secondtagupproject.linkedlist2;

import java.util.LinkedList;

public class MainL2 {

	public static void main(String[] args) {

		LinkedList<Integer> l1 = new LinkedList<Integer>();
		l1.add(50);
		l1.add(200);
		l1.add(540);
		l1.add(620);
		l1.add(50);
		l1.add(75);
		l1.add(30);

		System.out.println("First Occurence of " + l1.get(l1.indexOf(50))+" is at "+l1.indexOf(50) + " index");
		
		System.out.println("Last Occurence of " + l1.get(l1.lastIndexOf(50))+" is at "+l1.lastIndexOf(50) + " index");

	}

}
