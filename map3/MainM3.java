package com.jlc.secondtagupproject.map3;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MainM3 {

	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<String, String>();
		LinkedHashMap<String, String> hashMap = new LinkedHashMap<>();
		map.put("e", "e");
		map.put("f","f");
		map.put("c","c");
		map.put("a", "a");
		map.put("d","d");
		map.put("b","b");
		
		List<String> list = new LinkedList<>();
		for(Map.Entry<String, String> entry : map.entrySet())
			list.add(entry.getValue());
		
		Collections.sort(list);		
		
		for(String s : list) {
		for(Entry<String, String> entry1 : map.entrySet()){
			if(s.equals(entry1.getValue()))
				hashMap.put(entry1.getKey(), s);
		}
		}
		System.out.println(hashMap);
		
		
		
		
		
		
		
		//Map<String, String> linkedMap = new LinkedHashMap<String, String>();
		
		
		
		
		

	}

}
