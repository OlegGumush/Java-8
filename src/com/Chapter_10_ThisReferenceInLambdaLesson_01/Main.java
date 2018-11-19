
package com.Chapter_10_ThisReferenceInLambdaLesson_01;

import com.Chapter_09_CloserInLambdaLesson_01.Operaion;

public class Main {

	public static void main(String[] args) {
		int b = 90;
		Main.doOperate(b, x->{
			System.out.println(x+b);
			//System.out.println(this); lambda doesnt have this.
			} 
		);
	}
	public static void doOperate(int i , Operaion o) {
		o.operate(i);
	}
}
