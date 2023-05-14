package com.jlc.secondtagupproject.linkedlist4;

public class Employees implements Comparable<Employees> {

	private String name;
	private int id;
	private int salary;

	public Employees(String name, int id, int salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return this.name + "\t\t" + this.id + "\t\t" + this.salary;
	}

	@Override
	public int compareTo(Employees o) {

		return this.id - o.id;
	}

}
