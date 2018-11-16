package com.Chapter_05_IterateMapUsingForeach.Lesson_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		Map<Integer,Employee> map = new HashMap<>();
		
		map.put(1, new Employee("Oleg", 28));
		map.put(2, new Employee("Katy", 29));

		Set<Entry<Integer, Employee>> set = map.entrySet();
		for (Entry<Integer, Employee> e : set) {
			System.out.println(e);
		}
		
		System.out.println();
		
		
		set.forEach((s) -> System.out.println(s));
		
		set.forEach(System.out::println);

		//**** BiConsumer
		map.forEach((a , b) -> System.out.println(1 + "=" +b));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
