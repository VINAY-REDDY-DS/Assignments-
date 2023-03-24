package com.jlc.firstTagUpProject.shapes;

public class MainOfShapes {

	public static void main(String[] args) {
		System.out.println("Rectangle");
		Rectangle rect = new Rectangle();
		// System.out.println(rect.area(2,4)+" sqm.\n");
		// System.out.println(rect.area(2,4.4)+" sqm.\n");
		System.out.println(rect.area(2.8, 4) + " sqm.\n");
		// System.out.println(rect.area(2.2,4.5)+" sqm.\n\n");
		System.out.println("Triangle");
		Triangle tri = new Triangle();
		// System.out.println(tri.area(2,4)+" sqm.\n");
		System.out.println(tri.area(2, 4.4) + " sqm.\n");
		// System.out.println(tri.area(2.8,4)+" sqm.\n");
		// System.out.println(tri.area(2.2,4.5)+" sqm.\n\n");
		System.out.println("Circle");
		Circle cir = new Circle();
		System.out.println(cir.area(2) + " sqm.\n");
		// System.out.println(cir.area(4.4)+" sqm.\n");

	}

}
