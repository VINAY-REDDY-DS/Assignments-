package com.jlc.firstTagUpProject.book;

public class MainOfBook {

	public static void main(String[] args) {

		System.out.println(
				"Books Actual Price\n--------------------------------------------------\nPages\t\tSoft Bind\t\tHardBind\n100\t\t30\t\t\t50\n200\t\t60\t\t\t80\n400\t\t110\t\t\t150\n600\t\t150\t\t\t200\n--------------------------------------------------\n");

		Book book = new Book();

		System.out.println("Discounted Prices\n------------------");
		double res = book.price(200, "Soft Bind", 25);
		System.out.println("Soft Bind : " + res);

		System.out.println("Hard Bind " + book.price(100, "Hard Bind"));
	}

}
