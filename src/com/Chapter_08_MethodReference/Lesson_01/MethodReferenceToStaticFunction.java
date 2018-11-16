package com.Chapter_08_MethodReference.Lesson_01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MethodReferenceToStaticFunction {

	public static void main(String[] args) {
		
		// regular way
		ExecutorService service = Executors.newSingleThreadExecutor();
		service.execute(() -> System.out.println("Commnd!!!"));
		
		// my method reference
		ExecutorService service1 = Executors.newSingleThreadExecutor();
		service1.execute(MethodReferenceToStaticFunction::myRun);
	}
	
	private static void myRun() {
		System.out.println("Command1!!!");
	}
}
