package com.jlc.secondtagupproject.arraylist3;

import java.util.*;

public class MainA3 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(250);
		list.add(150);
		list.add(60);
		list.add(100);
		list.add(200);
		
		System.out.println(list);
		
		Object []num = list.toArray();
		Arrays.sort(num);
		System.out.println("The second largest element in a given arraylist are :\n"+num[num.length-2]);
		
		

	}

}
