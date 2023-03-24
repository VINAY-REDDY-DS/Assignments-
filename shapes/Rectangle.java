package com.jlc.firstTagUpProject.shapes;

public class Rectangle extends Shapes {

	public int area(int len, int wid) {
		System.out.println("The area of rectangle of parameter type (int,int) in sqm is :");
		return len * wid;
	}

	public double area(int len, double wid) {
		System.out.println("The area of rectangle of parameter type (int,double) in sqm is :");
		return len * wid;
	}

	public double area(double len, int wid) {
		System.out.println("The area of rectangle of parameter type (double,int) in sqm is :");
		return len * wid;
	}

	public double area(double len, double wid) {
		System.out.println("The area of rectangle of parameter type (double,double) in sqm is :");
		return len * wid;
	}

}
