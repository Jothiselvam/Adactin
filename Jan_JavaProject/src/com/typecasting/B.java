package com.typecasting;

public class B {
	int c=100;              //class
static int a=15;            //static

public void user() {
	int b=10;               //local
	System.out.println(b);
	
	
}
public static void main(String[]args) {
	B ref=new B();
	ref.user();
	System.out.println(a);
	System.out.println(ref.c);
}
}
