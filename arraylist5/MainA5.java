package com.jlc.secondtagupproject.arraylist5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MainA5 {

	public static void main(String[] args) {
		ArrayList<Employees> list = new ArrayList<Employees>();
		list.add(new Employees("Ramesh", 01, 50000));
		list.add(new Employees("Suresh", 02, 30000));
		list.add(new Employees("Mahesh", 03, 15000));
		list.add(new Employees("Lokesh", 04, 10000));
		list.add(new Employees("Yogesh", 05, 20000));

		System.out.println("Emp-name\tEmp-id\t\tEmp-sal\n----------------------------------------");

		Iterator<Employees> it = list.listIterator();
		while (it.hasNext()) {
			Employees emp = it.next();
			System.out.println(emp);
		}

		Collections.sort(list);

		System.out.println("\n\nAfter Sorting w.r.t. Salary");
		System.out.println("Emp-name\tEmp-id\t\tEmp-sal\n----------------------------------------");

		Iterator<Employees> it1 = list.listIterator();
		while (it1.hasNext()) {
			Employees emp = it1.next();
			System.out.println(emp);
		}

	}

}
