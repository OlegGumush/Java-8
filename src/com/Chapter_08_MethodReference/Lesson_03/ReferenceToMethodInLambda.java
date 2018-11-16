package com.Chapter_08_MethodReference.Lesson_03;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ReferenceToMethodInLambda {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("Oleg", "Oleg@gmail.com", "12345"));
		list.add(new Employee("Oleg1", "Oleg@gmail.com", "3241253"));
		list.add(new Employee("Ole2g", "Oleg@gmail.com", "3451234"));

		// Employee::getName - Reference To Method In Lambda
		List<String> names = ReferenceToMethodInLambda.getPersonsName(list,Employee::getName);
		System.out.println(names);
	}

	private static List<String> getPersonsName(List<Employee> list, Function<Employee, String> f) {

		List<String> names = new ArrayList<String>();
		list.forEach(e->names.add(f.apply(e)));
		return names;
	}

	
}
