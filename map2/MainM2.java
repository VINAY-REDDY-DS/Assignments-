package com.jlc.secondtagupproject.map2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class MainM2 {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("India", "delhi");
		map.put("AndhraPradesh", "Nocapital");
		map.put("Karnataka", "bangalore");
		map.put("Telangana", "hyderabad");
		map.put("Tamilnadu", "chennai");

		String value = "delhi";
		Iterator<Entry<String, String>> itr = map.entrySet().iterator();
		while (itr.hasNext()) {
			Entry<String, String> entry = itr.next();
			if (entry.getValue().equals(value)) {
				System.out.println(entry.getKey());
			}

		}
	}

}
