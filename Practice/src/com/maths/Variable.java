package com.maths;

public class Variable {
	static {
		System.out.println("Engineer");
	}
	public  Variable(String a) {
		System.out.println(a);
	}

	
	static String s=("Doctor");

	public  void vacancy() {
		System.out.println("Teacher");
	}
		public static void main(String[]args){
			
			Variable a=new Variable("Auditor");
		    a.vacancy();
			System.out.println(a.s);
			System.out.println("Salesman");	
			
		}
		


}