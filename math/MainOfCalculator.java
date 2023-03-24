package com.jlc.firstTagUpProject.math;

public class MainOfCalculator {

	public static void main(String[] args) {

		Calculator cal = new Calculator();
		System.out.println("Addition Operation");
		System.out.println(cal.add(10, 20) + "\n");
//		System.out.println(cal.add(10, 20.5)+"\n");
//		System.out.println(cal.add(10.5, 20)+"\n");
//		System.out.println(cal.add(10.5, 20.5)+"\n");

		System.out.println("Subtraction operation");
//		System.out.println(cal.sub(10, 20)+"\n");
		System.out.println(cal.sub(10, 20.5) + "\n");
//		System.out.println(cal.sub(10.5, 20)+"\n");
//		System.out.println(cal.sub(10.5, 20.5)+"\n");

		System.out.println("Multiplication operation");
//		System.out.println(cal.multi(10, 20)+"\n");
//		System.out.println(cal.multi(10, 20.5)+"\n");
		System.out.println(cal.multi(10.5, 20) + "\n");
//		System.out.println(cal.multi(10.5, 20.5)+"\n");

		System.out.println("Division operation");
//		System.out.println(cal.div(10, 20)+"\n");
//		System.out.println(cal.div(10, 20.5)+"\n");
//		System.out.println(cal.div(10.5, 20)+"\n");
		System.out.println(cal.div(10.5, 20.5) + "\n");

	}

}
