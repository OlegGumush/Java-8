package com.Chapter_01_Default_And_Static_Method_In_Interface.Lesson_01;

import java.util.Collections;
import java.util.List;


public interface MyInterface {

	public default List<Student> sortStudents(List<Student> list){
		
		Collections.sort(list);
		
		return list;
	}
	
	public static void greet(String name) {
		System.out.println("Welcome " + name);
	}
	
	public abstract Integer getMaxNum(List<Integer> list);
}
