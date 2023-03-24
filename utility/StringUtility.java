package com.jlc.firstTagUpProject.utility;

public class StringUtility {

	// Method to reverse a String
	public String reverse(String s) {
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		return rev;
	}

	// Method to count the Occurrence of substring in a given String
	public int countOccurenceOfSubString(String s, String subString) {
		int count = 0;
		int i = 0;
		while (i != -1) {
			// if substring is not found method returns the -1 value.
			i = s.indexOf(subString, i);
			if (i != -1) {
				count++;
				i++;
			}
		}
		return count;
	}

	// Method to check pallindrome or not
	public void palindrome(String s) {
		/*
		 * instead of performing the reverse operation here, i have called the reverse
		 * method by passing the inputed String from user.
		 */
		String rev1 = reverse(s);
		if (s.equals(rev1))
			System.out.println(s + " is Pallindrome");
		else
			System.out.println(s + " is not a Pallindrome");
	}

	// Method to find the substring from a given String
	public void subString(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				System.out.println(s.substring(i, j));
			}
		}

	}

	// Method to find the first index value of the given substring
	public void indexOf(String s, String sub) {
		int i = 0;
		System.out.println(s.indexOf(sub, i));

	}

}
