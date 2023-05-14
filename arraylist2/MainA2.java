package com.jlc.secondtagupproject.arraylist2;

import java.util.*;

public class MainA2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("vinay");
		list.add("Apple");
		list.add("dog");
		list.add("10");
		list.add("rat");
		list.add("Zebra");
		System.out.println("Before sorting : \n" + list);
		Collections.sort(list);
		System.out.println("\nAfter sorting : \n" + list);

		// if we want decending order reverse the sorted list

	}

}
