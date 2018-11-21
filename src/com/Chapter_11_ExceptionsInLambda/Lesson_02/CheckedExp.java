package com.Chapter_11_ExceptionsInLambda.Lesson_02;

import java.util.Arrays;
import java.util.List;

public class CheckedExp {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,0);
		list.forEach(i -> 
		{
			try {
				writeToFile(i);
			}catch (Exception e) {
				//wrap with unchecked exception
				throw new RuntimeException(e);
			}
		});
		
		//read about throwing consumer
		// ThrowingConsumer<T,E>
	}

	private static void writeToFile(Integer i) throws Exception{
		// TODO Auto-generated method stub
	}
}
