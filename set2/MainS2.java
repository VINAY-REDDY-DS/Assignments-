package com.jlc.secondtagupproject.set2;

import java.util.TreeSet;

public class MainS2 {

	public static void main(String[] args) {
		
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(50);
		treeSet.add(10);
		treeSet.add(90);
		treeSet.add(160);
		treeSet.add(30);
		treeSet.add(5);
		
		System.out.println(treeSet);
		System.out.println("Smallest element : "+treeSet.first());
		System.out.println("Largest element : "+treeSet.last());
		System.out.println(treeSet.descendingSet());

	}

}
