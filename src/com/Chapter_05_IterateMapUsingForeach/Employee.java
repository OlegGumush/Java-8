package com.Chapter_05_IterateMapUsingForeach;

public class Employee {
	private String name;
	private int age;

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
	
}
