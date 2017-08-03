package com.phearun.entity;

public class Employee {
	private String firstname;
	private String lastname;
	private String position;
	private String office;
	private String date;
	private double salary;
	
	public Employee() {
		super();
	}

	public Employee(String firstname, String lastname, String position, String office, String date, double salary) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.position = position;
		this.office = office;
		this.date = date;
		this.salary = salary;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [firstname=" + firstname + ", lastname=" + lastname + ", position=" + position + ", office="
				+ office + ", date=" + date + ", salary=" + salary + "]";
	}
}
