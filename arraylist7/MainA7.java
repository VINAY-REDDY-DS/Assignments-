package com.jlc.secondtagupproject.arraylist7;

import java.util.ArrayList;
import java.util.List;

public class MainA7 {
	
	//int count;

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(11);
		list.add(1);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(20);
		list.add(15);
		list.add(21);
		list.add(10);
		list.add(10);
		list.add(10);
		list.add(10);
		list.add(10);

		System.out.println(list);
		list = removeDuplicate(list);
		System.out.println(list);
//		ArrayList<Integer> list2 = new ArrayList<>();
		uniquePrimeNumbers(list);
		
		

	}

	public static ArrayList<Integer> removeDuplicate(ArrayList<Integer> number) {
		ArrayList<Integer> num = number;

		for (int i = 0; i < num.size(); i++) {

			for (int j = i + 1; j < num.size(); j++) {
				if (num.get(i).equals(num.get(j))) {
					num.remove(j);
					j--;
				}
			}
		}
		return num;
	}

	public static void uniquePrimeNumbers(ArrayList<Integer> number) {
		
		ArrayList<Integer> list2 = new ArrayList<>();
		
		ArrayList<Integer> prime = number;
		int num;
		int count=0;
		for(int i=1; i<prime.get(i); i++) {
			num = prime.get(i);
			if(num % i == 0)
				count++;
			
			if(count == 2)
				list2.add(i);
		}
		System.out.println(list2);
		
	}

}
