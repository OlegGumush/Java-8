package com.Chapter_17_Infinite_Streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		Stream<Integer> stream = Stream.iterate(0, i -> i+2);
		// Performs 10 actions
		List<Integer> result = stream.limit(10).collect(Collectors.toList());
		result.forEach(System.out::println);		
		
	}
}
