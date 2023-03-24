package com.jlc.firstTagUpProject.importmath;

import com.jlc.firstTagUpProject.math.*;

public class ArithmaticOperations {

	public static void main(String[] args) {
		/*
		 * creating object for the calculator class which is present in the imported
		 * package called "math".
		 */
		Calculator cal = new Calculator();

		// calling Different methods from "math" package
		System.out.println("called add method (int a, int b) : " + cal.add(50, 50) + "\n");
		System.out.println("called sub method (int a, double b) :" + cal.sub(30, 15.5) + "\n");
		System.out.println("called multi method (double a, int b) :" + cal.multi(20.5, 10) + "\n");
		System.out.println("called div method (double a, double b) :" + cal.div(50.5, 50.5) + "\n");

	}

}
