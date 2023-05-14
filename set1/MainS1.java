package com.jlc.secondtagupproject.set1;

import java.util.HashSet;

public class MainS1 {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		set.add("vinay");
		set.add("Apple");
		set.add("mango");
		set.add("banana");
		set.add("friuts");
		set.add("nothing");
		
		System.out.println(set);
		set.remove("nothing");
		
		System.out.println("Updated set :\n"+set);

	}

}
