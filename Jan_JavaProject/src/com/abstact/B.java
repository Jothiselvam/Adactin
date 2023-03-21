package com.abstact;

public class B extends A {
@Override
public void institute() {
	super.institute();
}		
	
@Override
	public void course() {
	System.out.println("JAVA Testing");
	
		
	}

@Override
	public void fees() {
System.out.println("20000")	;	
	}
public static void main(String[]args) {
	B ref= new B();
	ref.institute();
	ref.course();
	ref.fees();
	
	
}
}
