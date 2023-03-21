package com.overloading;

public class A {
	public void dress_Purchase(){
System.out.println("ABC Readymates");
		
	}
	public void dress_Purchase(String material) {
		System.out.println("Material Name:"+material);
	
	}
	public void dress_Purchase(String a, int b) {
		System.out.println(a+b);
		
	}
	
	public void dress_Purchase(String c, String d) {
		System.out.println(d+c);
	}
	public static void main(String[]args) {
		A ref=new A();
		ref.dress_Purchase();
		ref.dress_Purchase("Shirt");
		ref.dress_Purchase("Price:", 1000);
		ref.dress_Purchase("XL", "Size:");
		ref.dress_Purchase("Tshirt");
		ref.dress_Purchase("Price:", 500);
		ref.dress_Purchase("XXL", "Size:");
	}
}
