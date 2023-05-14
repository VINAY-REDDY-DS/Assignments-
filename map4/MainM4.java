package com.jlc.secondtagupproject.map4;

import java.util.*;
import java.util.Map.Entry;

public class MainM4 {

	public static void main(String[] args) {
		
		HashMap<String, ArrayList<String>> hashMap = new HashMap<>();
		
		ArrayList<String> computerScience = new ArrayList<>();
		computerScience.add("Vinay");
		computerScience.add("Naveen");
		computerScience.add("Suresh");
		computerScience.add("Chaitra");
		computerScience.add("Maheshwari");
		computerScience.add("Malyadri");
		hashMap.put("ComputerScience", computerScience);
		
		ArrayList<String> civil = new ArrayList<>();
		civil.add("Pavithra");
		civil.add("Rajesh");
		civil.add("Pawan");
		hashMap.put("Civil", civil);
		
		
		ArrayList<String> mechanical = new ArrayList<>();
		mechanical.add("Suraj");
		mechanical.add("Gavardhan");
		mechanical.add("Monish");
		hashMap.put("Mechanical", mechanical);
		
		ArrayList<String> electrical = new ArrayList<>();
		electrical.add("Madhan");
		electrical.add("Bindhu");
		electrical.add("Lokesh");
		electrical.add("Arjun");
		hashMap.put("Electrical", electrical);
		
		//System.out.println(hashMap);
		int maxEmp =0;
		String maxDept="";
		for(Entry<String, ArrayList<String>> entry : hashMap.entrySet()) {
			int numEmp=entry.getValue().size();
			if(numEmp > maxEmp) {
				 maxEmp = numEmp;
				maxDept=entry.getKey();
				//System.out.println(entry.getValue());
			}
			
		}
		
		System.out.println("Maximum number of Employees present in : "+maxDept+" Department");
		System.out.println("Employees are :");
		for(String employee : hashMap.get(maxDept)) {
			
			System.out.println(employee);
			
		}
			

	}

}
