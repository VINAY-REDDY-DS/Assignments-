package com.jlc.firstTagUpProject.utility;

import java.util.Scanner;

public class MainOfStringUtility {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = input.nextLine();

		StringUtility su = new StringUtility();

		// calling reverse method by passing user inputed String
		String rev = su.reverse(s);
		System.out.println("The reverseString of a given String is :  " + rev);

		/*
		 * calling countOccurenceOfSubString method by passing user inputed String and
		 * substring
		 */
//		System.out.println("Enter subString");
//		String sub = input.next();
//		int count = su.countOccurenceOfSubString(s, sub);
//		System.out.println("Count of substring : "+count);

		// calling paliindrome method by passing user inputed String
//		su.palindrome(s);
//
		// calling substring method
//		su.subString(s);

		// calling index value method for a given substring
//		System.out.println("Enter subString");
//		String sub = input.next();
//		System.out.print("index Value of given substring : ");
//		su.indexOf(s, sub);

		input.close();
	}

}
