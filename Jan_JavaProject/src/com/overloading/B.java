package com.overloading;
public class B extends A {	
@Override
public void dress_Purchase() {
super.dress_Purchase();
	}
	
@Override
		public void dress_Purchase(String material) {
			super.dress_Purchase(material);
		}
@Override
public void dress_Purchase(String a, int b) {
	super.dress_Purchase(a, b);
}
@Override
public void dress_Purchase(String c, String d) {
	super.dress_Purchase(c, d);
}
	
	public static void main (String[]args) {
		B ref=new B();
		ref.dress_Purchase();
		ref.dress_Purchase("Frock");
		ref.dress_Purchase("Price:", 2000);
		ref.dress_Purchase("XL", "Size:");
		ref.dress_Purchase("Kurti");
		ref.dress_Purchase("Price:", 1000);
		ref.dress_Purchase("XXL", "Size:");
	}
	
}

