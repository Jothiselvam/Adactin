package com.maths;

public class Exception_Task {
	   
	private static void method0() {
		System.out.println("try with single catch");
	
		try {
			int a=3/0;
			System.out.println(a);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("Remaining lines");
	}
	
	
	private static void method4() {
		System.out.println("multiple try with single catch");
		try {
			int a=3/0;
			System.out.println(a);
		}
		finally {
			System.out.println("Ignore Exception");
		}
		try {
			int a=3/0;
			System.out.println(a);
			
		} 
		 catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("Remaining lines");
	}
	
		private static void method1() {
			System.out.println("single try with multiple catch");
			try {
				int a=3/0;
				System.out.println(a);
			} catch (ArithmeticException e) {
				e.printStackTrace();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			finally {
				System.out.println("Ignore Exception");
			}
			System.out.println("Remaining lines");
		}
		
		
	private static void method2() {
		System.out.println("without catch");
			try {
				int a=3/0;
				System.out.println(a);
			}
			finally {
				System.out.println("Ignore Exception");
			}
			System.out.println("Remaining lines");
			
			
			
		}
	
	//without try
//	private static void method3() {
//		
//			int a=3/0;
//			System.out.println(a);
//			//catch (ArithmeticException e) {
//				e.printStackTrace();
//			} 
//		
//		//finally {
//			System.out.println("Ignore Exception");
//		}
public static void main(String[] args) {
	//method0();
    // method1();
    method2();
	//method4();
	
}
}

