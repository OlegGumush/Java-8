package com.Chapter_03_LambdaExpression.Lesson_03;

public class RetureValueFromLambda {

	public static void main(String[] args) {
		MyInterface myInterface = (n1,n2) -> {
			return n1 > n2;
		};
		System.out.println(myInterface.test(40, 60));
	
		
		
		MyInterface myInterface1 = (n1,n2) -> n1 < n2;
		System.out.println(myInterface1.test(40, 60));
	
	}
}
