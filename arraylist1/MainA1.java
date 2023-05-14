package com.jlc.secondtagupproject.arraylist1;

import java.util.*;

public class MainA1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
//		list.add("vinay");
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		System.out.println(list);
		int sum = 0;
		for (Integer num : list) {
			sum+=num;
		}
		System.out.println("sum of all list elements are : "+sum);
		
		//if list is hetrogeneous we use 
//		ListIterator it = list.listIterator();
//		while(it.hasNext()) {
//			Object obj = it.next();
//			if(obj instanceof Integer) {
//				sum+= (Integer)obj;
//			}
//		}
//		System.out.println(sum);

//		for (Object num : list) {
//			if(num instanceof Integer)
//				sum+= (Integer)num;  //if list is hetrogenous we sld type cast 
//		}
//		System.out.println(sum);
//		
//		for (int i = 0; i < list.size(); i++) {
//			Object obj = i;
//			if(obj instanceof Integer) {
//				sum+=(Integer)obj;
//			}
//		}
//		System.out.println(sum);

	}

}
