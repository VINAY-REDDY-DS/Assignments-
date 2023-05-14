package com.jlc.secondtagupproject.arraylist4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainA4 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(2);
		list.add(1);
		list.add(5);
		list.add(4);
		list.add(6);
		list.add(5);
		System.out.println("With duplicates :\n"+list);
		Set<Integer> updated = new HashSet<Integer>(list);
		List<Integer> list1 = new ArrayList<Integer>(updated);
		System.out.println("\nWithout duplicates :\n"+list1);

	}

}
