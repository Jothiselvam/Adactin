package com.sample;

public class B extends A {
	public void icecream() {
	System.out.println("Vennila");
	System.out.println("Chocolate");
	
}
public void coldring() {
	System.out.println("Mazza");
	System.out.println("Coke");
}
public static void main(String[]args) {
	
	 B a=new B();
	 a.icecream();
	 a.coldring();
	 a.vegetable();
	 a.fruit();
	 
}
}
