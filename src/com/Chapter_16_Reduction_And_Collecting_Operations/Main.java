package com.Chapter_16_Reduction_And_Collecting_Operations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(10);
		
		Integer i = list.stream().reduce(1000, (x,b) -> x / b);
		System.out.println(i);
		
		List<String> list1 = new ArrayList<>();
		list1.add("oleg");
		list1.add("igor");
		list1.add("katy");
		
		System.out.println("-----------------------------------------------------");
		
		List<String> result = list1.stream()
								   .map(elem -> elem.toUpperCase())
								   .collect(Collectors.toList());
		
		result.forEach(System.out::println);

	}
}
