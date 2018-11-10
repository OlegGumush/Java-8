package com.Chapter_01_Default_And_Static_Method_In_Interface.Lesson_01;

public class Student implements Comparable<Student>{

	public String name;
	public Integer age;
	
	
	
	public Student(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}



	@Override
	public int compareTo(Student o) {
		return this.name.compareTo(o.name);
	}



	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	
}
