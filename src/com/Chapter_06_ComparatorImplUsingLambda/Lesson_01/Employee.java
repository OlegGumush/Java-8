package com.Chapter_06_ComparatorImplUsingLambda.Lesson_01;

public class Employee {

	private String name ;
	private String email ;
	private String salary ;
	
	public Employee(String name, String email, String salary) {
		super();
		this.name = name;
		this.email = email;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", email=" + email + ", salary=" + salary + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	
}
