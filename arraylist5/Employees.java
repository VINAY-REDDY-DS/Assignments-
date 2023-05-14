package com.jlc.secondtagupproject.arraylist5;

public class Employees implements Comparable<Employees>{
	private String name;
	private Integer id;
	private Integer salary;

	public Employees(String name, int id, int salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}

	public Integer getId() {
		return id;
	}

	public Integer getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return this.name+"\t\t"+this.id +"\t\t"+this.salary;
	}

	@Override
	public int compareTo(Employees o) {
		
		return o.salary.compareTo(this.salary);
	}
	
	

}
