package com.constructor;
public class ConstructorA {
	public  ConstructorA() {
		System.out.println("Greens Tech");
	}
	
	
	
	public  ConstructorA(String a) {
		System.out.println(a);
	
		
	}
	public ConstructorA(String b, int c) {
		System.out.println(b+c);
		
	}
	public ConstructorA(String d, String e) {
		System.out.println(d+e);
	}
	
	
public static void main(String[]args) {
    ConstructorA ref = new ConstructorA();
    ConstructorA ref1= new ConstructorA("Employee Name:Jothi");
	ConstructorA ref2= new ConstructorA("Age:",30);
	ConstructorA ref3= new ConstructorA("Qualification:", "BE");

	
}
}
