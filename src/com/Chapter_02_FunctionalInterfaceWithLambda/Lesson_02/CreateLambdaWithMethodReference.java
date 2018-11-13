package com.Chapter_02_FunctionalInterfaceWithLambda.Lesson_02;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class CreateLambdaWithMethodReference {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Oleg");
		list.add("Katy");
		list.add("Popchik");

		// anonymous class
		list.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});

		System.out.println();
		
		
		//create a consumer with lambda
		list.forEach((name) -> System.out.println(name));
		
		
		// method reference
		list.forEach(System.out::println);
	}
}
