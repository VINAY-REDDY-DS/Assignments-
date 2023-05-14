package com.jlc.secondtagupproject.set3;

public class Book implements Comparable<Book> {
	
	private String title;
	private String author;
	private int publicationYear;
	
	public Book(String title, String author, int publicationYear) {
		
		this.title = title;
		this.author = author;
		this.publicationYear = publicationYear;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	@Override
	public String toString() {
		return this.title+"\t\t"+this.author+"\t\t"+this.publicationYear;
	}

	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return this.author.compareTo(o.author);
	}
	
	
	
	
	

}
