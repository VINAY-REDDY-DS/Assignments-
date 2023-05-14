package com.jlc.secondtagupproject.map5;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MainM6 {

	public static void main(String[] args) {

		TreeMap<String, Integer> hashMap = new TreeMap<>();

		hashMap.put("rahul", 68);
		hashMap.put("soni", 71);
		hashMap.put("madhu", 54);
		hashMap.put("brami", 94);
		hashMap.put("ramesh", 21);
		hashMap.put("arun", 65);
		hashMap.put("vishal", 55);
		hashMap.put("buvi", 26);
		hashMap.put("govind", 36);
		hashMap.put("rani", 69);
		hashMap.put("somu", 94);
		hashMap.put("lokesh", 85);
		hashMap.put("banu", 94);
		hashMap.put("vignesh", 65);
		hashMap.put("deny", 55);
		hashMap.put("ragav", 26);

		Iterator<Entry<String, Integer>> itr = hashMap.entrySet().iterator();
		System.out.println("Students Who Scored Highest marks : ");

		while (itr.hasNext()) {

			Entry<String, Integer> entry = itr.next();

			int max = Collections.max(hashMap.values());
			if (max == entry.getValue()) {

				System.out.println("Student_Name : " + entry.getKey()+"\tMarks : "+max);
			}
		}

	}

}
