package com.Chapter_15_Mapping;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.Chapter_14_Filtering_And_Matching.Employee;

public class Main {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("t", "Oleg@gmail.com", "14"));
		list.add(new Employee("b", "Oleg@gmail.com", "2"));
		list.add(new Employee("c", "Oleg@gmail.com", "3"));
	
		
		// map return a stream.
		Stream<String> stream = list.stream().map( elem -> elem.getName());
		stream.forEach(System.out::println);
		
			
		List<Employee> list1 = new ArrayList<Employee>();
		list1.add(new Employee("t", "Oleg@gmail.com", "14"));
		list1.add(new Employee("b", "Oleg@gmail.com", "2"));
		list1.add(new Employee("c", "Oleg@gmail.com", "3"));
		List<Employee> list2 = new ArrayList<Employee>();
		list2.add(new Employee("t", "Oleg@gmail.com", "14"));
		list2.add(new Employee("b", "Oleg@gmail.com", "2"));
		list2.add(new Employee("c", "Oleg@gmail.com", "3"));
		
		//get all employees from both lists list1 and list2
		List<List<Employee>> flat = new ArrayList<>();
		flat.add(list1);
		flat.add(list2);
		Stream<Employee> flatList = flat.stream().flatMap(x -> x.stream());
		flatList.forEach(System.out::println);

	}
}
