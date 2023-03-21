package com.sampleinterface;

public class B implements A {

	@Override
	public void vacancy1() {
		System.out.println("Java Developer");
		
	}

	@Override
	public void vacancy2() {
		System.out.println("Java Tester");
	}

	@Override
	public void vacancy3() {
		System.out.println("Python developer");
		
	}

	@Override
	public void vacancy4() {
		System.out.println("Python Tester");
		
	}
	public static void main(String[]args) {
		B ref=new B();
		ref.vacancy1();
		ref.vacancy2();
		ref.vacancy3();
		ref.vacancy4();
	}
	

}
