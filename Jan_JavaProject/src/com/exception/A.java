package com.exception;
import java.util.ArrayList;

public class A {
	public static void main(String[]args) {
		System.out.println("Start");
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3/0);   //Arithmetic
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Not Possible");
		}
		
		
		finally {
		System.out.println("End");
		}

		System.out.println(4);
	}

}
