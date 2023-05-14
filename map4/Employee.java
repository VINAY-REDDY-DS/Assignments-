package com.jlc.secondtagupproject.map4;

public class Employee {

	private int emp_id;
	private String emp_name;
	private String dept_name;
	private Department dept;

	public Employee(int emp_id, String emp_name, String dept_name) {
		
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.dept_name = dept_name;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", dept_name=" + dept_name + "]";
	}

}
