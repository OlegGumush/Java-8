package com.Chapter_13_ParallelStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class Main {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("t", "Oleg@gmail.com", "14"));
		list.add(new Employee("b", "Oleg@gmail.com", "2"));
		list.add(new Employee("c", "Oleg@gmail.com", "3"));
		
		Stream<Employee> employees = list.parallelStream();
		employees.forEach( x -> doProcess(x));
	}

	private static Object doProcess(Employee x) {
		System.out.println(x.getName());
		return null;
	}
}
