package com.Chapter_07_TypeInference;

public class Main {

	public static void main(String[] args) {
		
		// type inference
		MyComparator compare = (n1,n2) -> n1 < n2;
		System.out.println(compare.compare(30, 80));
	}
}
