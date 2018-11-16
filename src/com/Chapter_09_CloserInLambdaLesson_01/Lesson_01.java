package com.Chapter_09_CloserInLambdaLesson_01;


public class Lesson_01 {



	public static void main(String[] args) {
		int x = 30 ;
		final int y = 34 ; 
		
		// if we try to change y value in anonymous class it will cause to an Exception
		doOperate(x, (int n) -> System.out.println(x+y));
	}
	
	public static void doOperate(int i , Operaion o) {
		o.operate(i);
	}
}
