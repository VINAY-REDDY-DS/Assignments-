package com.jlc.secondtagupproject.map1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class MainM1 {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("Apple", 100);
		map.put("banana", 20);
		map.put("grapes", 50);
		map.put("orange", 80);
		map.put("pomagranate", 40);
		map.put(null, 20);

		// iterating over entry
		Iterator<Entry<String, Integer>> it1 = map.entrySet().iterator();
		while (it1.hasNext()) {
			Entry<String, Integer> entry = it1.next();
			System.out.println(entry.getKey()+" : "+entry.getValue());
//			System.out.println(it1.next());
		}

//		System.out.println("-------------------------");
//
//		// iterating over keys
//		Iterator<String> it = map.keySet().iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
//		System.out.println("-------------------------");
//
//		// iterating over values
//		// Collection<Integer> values = map.values();
//		Iterator<Integer> it2 = map.values().iterator();
//		while (it2.hasNext()) {
//			System.out.println(it2.next());
//		}

	}

}
