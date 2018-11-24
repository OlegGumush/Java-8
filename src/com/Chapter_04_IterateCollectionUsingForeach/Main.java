package com.Chapter_04_IterateCollectionUsingForeach;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("Oleg", 100));

		list.forEach(new MyConsumer());

		// do the same without implement a class
		
		//Consumer take one parameter and do something
		list.forEach((s) -> System.out.println(s));
		
		//also work
		list.forEach(System.out::println);
		
		//my static print
		list.forEach(StaticPrint::print);
		
	}
}
