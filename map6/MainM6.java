package com.jlc.secondtagupproject.map6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;

public class MainM6 {

	public static void main(String[] args) {

		HashMap<Integer, LinkedList<String>> hashMap = new HashMap<>();

		LinkedList<String> list51to60 = new LinkedList<>();
		list51to60.add("rahul");
		list51to60.add("soni");
		list51to60.add("madhu");
		list51to60.add("brami");
		list51to60.add("ramesh");
		list51to60.add("arun");
		list51to60.add("vishal");
		hashMap.put(51, list51to60);

		LinkedList<String> list61to70 = new LinkedList<>();
		list61to70.add("buvi");
		list61to70.add("pinki");
		list61to70.add("arshad");
		list61to70.add("loki");
		list61to70.add("santosh");
		list61to70.add("ajay");
		list61to70.add("pooja");
		hashMap.put(61, list61to70);

		LinkedList<String> list71to80 = new LinkedList<>();
		list71to80.add("dinesh");
		list71to80.add("arvind");
		list71to80.add("charisha");
		list71to80.add("kavitha");
		list71to80.add("esha");
		list71to80.add("raju");
		list71to80.add("pavi");
		hashMap.put(71, list71to80);

		Iterator<Entry<Integer, LinkedList<String>>> itr = hashMap.entrySet().iterator();
		System.out.println("Students marks between 61 - 70");
		while (itr.hasNext()) {
			Entry<Integer, LinkedList<String>> entry = itr.next();
			if (entry.getKey() >= 61 && entry.getKey() <= 70)
				System.out.println(entry.getValue());
		}

	}

}
