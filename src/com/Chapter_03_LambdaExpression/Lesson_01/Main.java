package com.Chapter_03_LambdaExpression.Lesson_01;

public class Main {

	public static void main(String[] args) {
		
		
		MyRunnable a = new MyRunnable();		
		Thread a1 = new Thread(a);
		a1.start();
		
		Thread a2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread with anonymus class");
			}
		});
		a2.start();

		
		Thread a3 = new Thread(() -> System.out.println("Thread with lambda"));
		a3.start();
	}
}
