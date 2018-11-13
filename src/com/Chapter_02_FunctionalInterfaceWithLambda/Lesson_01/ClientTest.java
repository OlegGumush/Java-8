package com.Chapter_02_FunctionalInterfaceWithLambda.Lesson_01;

public class ClientTest {

	public static void main(String[] args) {
		
		// anonymous class - runnable is functional interface
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Anonymous");
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		
		// using lambda expression
		Runnable r1 = () -> { System.out.println("Lambda");};
		Thread t1 = new Thread(r1);
		t1.start();
	}
}
