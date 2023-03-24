package com.jlc.firstTagUpProject.importedutility;

import java.util.Scanner;

import com.jlc.firstTagUpProject.utility.StringUtility;

public class TestString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = input.nextLine();

		StringUtility su = new StringUtility();

		/*
		 * By using fully qualified name of the package we can call the methods of diff
		 * package without importing the package
		 */
//		com.jlc.firstTagUpProject.utility.StringUtility su = new com.jlc.firstTagUpProject.utility.StringUtility();
//		su.palindrome(s);

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
//
//		//calling paliindrome method by passing user inputed String
//		su.palindrome(s);
//
//		//calling substring method
//		su.subString(s);
//
//		//calling index value method for a given substring
//		System.out.println("Enter subString");
//		String sub = input.next();
//		System.out.print("index Value of given substring : ");
//		su.indexOf(s, sub);

		input.close();
	}

}
