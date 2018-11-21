package com.Chapter_11_ExceptionsInLambda.Lesson_01;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class UncheckedExp {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,0);
		
		System.out.println( "external try catch");
		try {
			list.forEach(x -> System.out.println(50/x));
			
		} catch (Exception e) {
			System.out.println("Aithmetic Exception Occured : "+e.getMessage());
		}
		
		//System.out.println( "regular exception");
		//list.forEach(x -> System.out.println(50/x));

		System.out.println( "wrapper lambda try catch");
		list.forEach(lambdaWrapper(x -> System.out.println(50/x)));

		
		System.out.println( "wrapper lambda try catch");
		list.forEach(consumerWrapperGeneric(x -> System.out.println(50/x),Exception.class));
	}
	
	public static <T,E extends Exception> Consumer<T> consumerWrapperGeneric(Consumer<T> consumer,Class<E> clazz){
		
		
		return i -> {
			try {
				consumer.accept(i);
			} catch (Exception e) {
				System.out.println("Exveption has occured:" + e.getMessage());
			}
		};
	}
	
	public static Consumer<Integer> lambdaWrapper(Consumer<Integer> consumer){
		
		return i -> {
			try {
				consumer.accept(i);
			}catch (Exception e) {
				System.out.println("Aithmetic Exception Occured : "+e.getMessage());
			}
		};
	}
}
