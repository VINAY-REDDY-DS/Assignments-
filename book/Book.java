package com.jlc.firstTagUpProject.book;

public class Book {
	// number of pages, type of cover, discount

	public double price(int pages, String softcover, int discount) {
		double res = (((pages * 20) / 100) - (25 / 100));
		return res;
	}

	public double price(int pages, String hardcover) {
		double res = (((pages * 30) / 100) - (25 / 100));
		return res;
	}

}
