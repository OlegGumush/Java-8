package com.Chapter_12_StreamCreation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		String arr[] = new String[] {"a","b"};
		Stream<String> stream = Arrays.stream(arr);
		stream.forEach(System.out::println);
		System.out.println("--------------------------------------------");
		Stream<String> stream1 = Stream.of("a","b");
		stream1.forEach(System.out::println);
		System.out.println("--------------------------------------------");
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.stream().forEach(System.out::println);

	}
}
