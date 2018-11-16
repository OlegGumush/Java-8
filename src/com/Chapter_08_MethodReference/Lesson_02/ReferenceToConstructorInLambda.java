package com.Chapter_08_MethodReference.Lesson_02;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ReferenceToConstructorInLambda {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(4,9,36,10000);
		
		// method reference
		list.forEach(System.out::println);
		System.out.println();
		
		// constructor reference WOW 
		ReferenceToConstructorInLambda.findSquareRoots(list,String::new);

	}

	// I'm actually sending a STRING constructor ITS knows how to get a BYTES[] and BUILD a STRING to me.
	// another option : Function<StringBuffer, String> f
	private static void findSquareRoots(List<Integer> list, Function<byte[], String> f) {
		   	
		list.forEach((x) -> System.out.println(f.apply(new byte[] {x.byteValue()})));
	}
}
