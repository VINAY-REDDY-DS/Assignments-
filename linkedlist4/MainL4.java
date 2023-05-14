package com.jlc.secondtagupproject.linkedlist4;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class MainL4 {

	public static void main(String[] args) {

		LinkedList<Employees> l1 = new LinkedList<Employees>();
		l1.add(new Employees("Ramesh", 05, 50000));
		l1.add(new Employees("Suresh", 02, 30000));
		l1.add(new Employees("Mahesh", 01, 15000));
		l1.add(new Employees("Lokesh", 04, 10000));
		l1.add(new Employees("Yogesh", 03, 20000));

		System.out.println("Emp-name\tEmp-id\t\tEmp-sal\n----------------------------------------");

		Iterator<Employees> it = l1.listIterator();
		while (it.hasNext()) {
			Employees emp = it.next();
			System.out.println(emp);
		}

		Collections.sort(l1);

		System.out.println("\n\nAfter Sorting w.r.t. ID");
		System.out.println("Emp-name\tEmp-id\t\tEmp-sal\n----------------------------------------");

		Iterator<Employees> it1 = l1.listIterator();
		while (it1.hasNext()) {
			Employees emp = it1.next();
			System.out.println(emp);
		}

	}

}
