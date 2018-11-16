package com.Chapter_09_CloserInLambdaLesson_01;


public class Lesson_01 {



	public static void main(String[] args) {
		int x = 30 ;
		int y = 34 ; 
		
		doOperate(x, (int n) -> {
			    //error y should be final
				//y= 100;
				System.out.println(x+y);
			}
		);
	}
	
	public static void doOperate(int i , Operaion o) {
		o.operate(i);
	}
}
