package com.Chapter_03_LambdaExpression.Lesson_02;

public class Main {

	public static void main(String[] args) {
		
		//anonymous class
		MyInterface my = new MyInterface() {
			
			@Override
			public void method1() {
				System.out.println("Anonymus impl of MyInterface");
			}
		};
		my.method1();
		
		//lambda
		MyInterface my1 = () -> System.out.println("Anonymus impl of MyInterface");
		my1.method1();
		
		System.out.println();
		
		// anonymous class
		MyInterfaceWithParams my3 = new MyInterfaceWithParams() {
			
			@Override
			public void method2(String name) {
				System.out.println(name);
			}
		};
		my3.method2("Oleg");
		
		
		// lambda class
		MyInterfaceWithParams my4 = (String name) -> {System.out.println(name);};
		my4.method2("Oleg");
	}
}
