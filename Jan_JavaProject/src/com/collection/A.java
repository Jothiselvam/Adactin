package com.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class A {
	
	public static void main(String[]args) {
		System.out.println("****ArrayList****");
		List<Object>a=new ArrayList<Object>();
		//add
		a.add("ECE");
		a.add(30);
		a.add("Civil");
		a.add(40);
		System.out.println(a);
		//size
		System.out.println("****Size****");
	    System.out.println(a.size());
	     //get
	     System.out.println("****Get****");
	     System.out.println(a.get(1));
	    //set
	    System.out.println("****Set****");
		Object set = a.set(0, "EEE");
	    System.out.println(a);
	    //remove
	    System.out.println("****Remove****");
		a.remove(0);
	   System.out.println(a);
		//index of
	   System.out.println("****Indexof****");
		int indexOf = a.indexOf(40);
		System.out.println(indexOf);
		//contains
		System.out.println("****Contains****");
		boolean contains = a.contains("ECE");
		System.out.println(contains);
		//clear
		//System.out.println("****Clear****");
		//a.clear();
		//System.out.println(a);
		System.out.println("****LinkedList****");
		List<Object>b=new LinkedList<Object>();
			b.add("EEE");
			b.add(30);
			b.add("Mech");
			b.add(40);
			System.out.println(b);
			
			//add all
			System.out.println("****AddAll****");
			a.addAll(b);
            System.out.println(a);
	}
	

}
