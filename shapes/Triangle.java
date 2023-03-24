package com.jlc.firstTagUpProject.shapes;

public class Triangle extends Shapes {

	public double area(int base, int height) {
		System.out.println("The area of triangle of parameter type (int,int) in sqm is : ");
		return 0.5 * base * height;
	}

	public double area(int base, double height) {
		System.out.println("The area of triangle of parameter type (int,double) in sqm is : ");
		return 0.5 * base * height;
	}

	public double area(double base, int height) {
		System.out.println("The area of triangle of parameter type (double,int) in sqm is : ");
		return 0.5 * base * height;
	}

	public double area(double base, double height) {
		System.out.println("The area of triangle of parameter type (double,double) in sqm is : ");
		return 0.5 * base * height;
	}

}
