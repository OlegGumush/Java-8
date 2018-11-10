package com.Chapter_01_Default_And_Static_Method_In_Interface.Lesson_01;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Student> l1 = new ArrayList<>();
		l1.add(new Student("1", 123));
		l1.add(new Student("3", 123));
		l1.add(new Student("4", 123));
		l1.add(new Student("2", 123));
		l1.add(new Student("5", 123));

		System.out.println(l1);

		MyInterface m = new MyInterfaceImpl();
		List<Student> l2 = m.sortStudents(l1);
		
		System.out.println(l2);
	}
}
