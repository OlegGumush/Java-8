package com.Chapter_01_Default_And_Static_Method_In_Interface.Lesson_02;

public class Welcome implements I1,I2{

	
	public static void main(String[] args) {
		Welcome w = new Welcome();
		w.desplay();
	}

//	@Override
//	public void desplay() {
//		
//		// Override I1 default
//		I1.super.desplay();
//		System.out.println("Welcome");
//	}
	
	@Override
	public void desplay() {
		
		// Override I2 default
		I2.super.desplay();
		System.out.println("Welcome");
	}
}
