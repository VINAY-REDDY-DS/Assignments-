package com.jlc.firstTagUpProject.shapes;

public class Circle extends Shapes {
	public double area(int radius) {
		System.out.println("The are of circle of parameter type (int) in sqm is :");
		return PI * radius * radius;
	}

	public double area(double radius) {
		System.out.println("The are of circle of parameter type (double) in sqm is :");
		return PI * radius * radius;
	}

}
