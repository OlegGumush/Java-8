package com.Chapter_08_MethodReference.Lesson_04;

import java.util.ArrayList;
import java.util.List;

public class ReferenceToInstanceMethodInLambda {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		names.add("213");
		names.add("sdfsdf");
		
		//names.forEach(x -> System.out.println(x));
		
		
		//Ssytem is class , out is an object , print is function
		names.forEach(System.out::println);
	}
}
