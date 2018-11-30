package com.Chapter_14_Filtering_And_Matching;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class Main {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("t", "Oleg@gmail.com", "14"));
		list.add(new Employee("b", "Oleg@gmail.com", "2"));
		list.add(new Employee("c", "Oleg@gmail.com", "3"));
		
		//filter
		Stream<Employee> employees = list.stream().filter(x -> x.getEmail().contains("O"));
		employees.forEach(System.out::println);
		
		System.out.println("---------------------------------------------------");
		
		//match
		boolean isAllMatch = list.stream().allMatch(x -> x.getEmail().contains("O"));
		System.out.println(isAllMatch);
		//match
		boolean isNoneMatch = list.stream().noneMatch(x -> x.getEmail().contains("O"));
		System.out.println(isNoneMatch);
		//match
		boolean isAnyMatch = list.stream().anyMatch(x -> x.getSalary().equals("3"));
		System.out.println(isAnyMatch);
	}
}
