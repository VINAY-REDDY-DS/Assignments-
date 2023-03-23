package com.jlc.firstTagUpProject.vehicle;

public class MainOfVehicles {

	public static void main(String[] args) {
		
		Bike b = new Bike();
		System.out.println(b.fuelEfficiency(100, 2)+" km/lts\n");

		
		Car c = new Car();
		System.out.println(c.fuelEfficiency(100, 10)+" km/lts\n");
		
		Truck t = new Truck();
		System.out.println(t.fuelEfficiency(100, 40)+" km/lts");
		
		

	}

}
