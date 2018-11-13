package com.Chapter_02_FunctionalInterfaceWithLambda.Lesson_01;

@FunctionalInterface
public interface NonFunctionalInterface {

	//public abstract void m1(); - error - break the @FunctionalInterface , we can write only one abstract method
	public abstract void m2();
	
	@Override
	boolean equals(Object obj); 								  //not break the @FunctionalInterface because this is Object class method
	
	default void m3() {
		System.out.println("Not break the @FunctionalInterface"); //not break the @FunctionalInterface because this is default method
	}
	
	static void m4() {
		System.out.println("Not break the @FunctionalInterface"); //not break the @FunctionalInterface because this is static method
	}
}
