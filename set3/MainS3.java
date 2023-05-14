package com.jlc.secondtagupproject.set3;

import java.util.Iterator;
import java.util.TreeSet;

public class MainS3 {

	public static void main(String[] args) {
		
		
		TreeSet<Book> treeSet = new TreeSet<Book>();
		treeSet.add(new Book("Legend", "Vinay        ", 1998));
		treeSet.add(new Book("Pushpa", "Sukumar      ", 2015));
		treeSet.add(new Book("KGF", "Prasanth neel", 2018));
		treeSet.add(new Book("RRR", "Rajamouli    ", 2020));
		treeSet.add(new Book("Avathar", "James Cameron", 2012));
		
		System.out.println("Book\t\tAuthor\t\t\tPublishedYear\n----------------------------------------------");
		for(Object obj : treeSet)
			System.out.println(obj);
		
		System.out.println("\n\nBook\t\tAuthor\t\t\tPublishedYear\n----------------------------------------------");
		Iterator<Book> itr = treeSet.iterator();
		while(itr.hasNext()) {
			Book b = itr.next();
			if(b.getPublicationYear()>=2015 && b.getPublicationYear()<=2020)
			System.out.println(b);
		}
		

	}

}
