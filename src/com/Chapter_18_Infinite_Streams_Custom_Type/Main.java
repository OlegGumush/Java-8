package com.Chapter_18_Infinite_Streams_Custom_Type;

import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
				
		Supplier<UUID> supplier = UUID::randomUUID;
		Stream<UUID> generate = Stream.generate(supplier);
		List<UUID> result = generate
							.skip(10)
							.limit(10)
							.collect(Collectors.toList());
		result.forEach(System.out::println);		

		// standard way
		for (int i = 0; i < 3; i++) {
			System.out.println(i);
		}
		
		// stream way
		Stream<Integer> integers = Stream.iterate(0, i -> i+1);
		integers.limit(3).forEach(System.out::println);
		
		// stream way
		Stream.iterate(0, i -> i+1)
			  .limit(3)
			  .forEach(System.out::println);	
		
	}
}
