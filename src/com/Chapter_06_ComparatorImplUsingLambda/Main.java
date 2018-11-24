package com.Chapter_06_ComparatorImplUsingLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("t", "Oleg@gmail.com", "14"));
		list.add(new Employee("b", "Oleg@gmail.com", "2"));
		list.add(new Employee("c", "Oleg@gmail.com", "3"));

		
		Collections.sort(list, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		System.out.println(list);
		
		
		Collections.sort(list, (s1,s2) -> s1.getName().compareTo(s2.getName()));  
		System.out.println(list);
	}
}
