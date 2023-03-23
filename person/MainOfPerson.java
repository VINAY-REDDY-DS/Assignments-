package com.jlc.firstTagUpProject.person;

public class MainOfPerson {

	public static void main(String[] args) {

		System.out.println("NAME\t\t\tAGE\t\tADDRESS\n");
		Person p1 = new Person("Vinay", 24, "Bangalore");
		Person p2 = new Person("Chaitra", "America");
		Person p3 = new Person("SaiNaveen", 28);
		Person p4 = new Person("Maheshwari", 30, "AndhraPradesh");
		Person p5 = new Person("suresh");
		Person p6 = new Person(54);

		System.out.println(p1.getName() + "\t\t\t" + p1.getAge() + "\t\t" + p1.getAddress());
		System.out.println(p2.getName() + "\t\t\t" + p2.getAge() + "\t\t" + p2.getAddress());
		System.out.println(p3.getName() + "\t\t" + p3.getAge() + "\t\t" + p3.getAddress());
		System.out.println(p4.getName() + "\t\t" + p4.getAge() + "\t\t" + p4.getAddress());
		System.out.println(p5.getName() + "\t\t\t" + p5.getAge() + "\t\t" + p5.getAddress());
		System.out.println(p6.getName() + "\t\t\t" + p6.getAge() + "\t\t" + p6.getAddress());
		System.out.println("\nData Updated Sucessfully");

	}

}
