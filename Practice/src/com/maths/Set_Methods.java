package com.maths;
import java.util.HashSet;
import java.util.Set;
public class Set_Methods {
	public static void main(String[] args) {
		Set <Integer> Bill1=new HashSet<Integer>();
       Bill1.add(10);
       Bill1.add(20);
       Bill1.add(30);
       Bill1.add(40);
       
       System.out.println(Bill1);
       int size = Bill1.size();
       System.out.println("Size of Bill1 :" +size);
//       Integer integer = Bill1.get(2);
//       System.out.println("Value of index 2 :"+integer);
//       Bill1.set(2, 40);
//       System.out.println("Value of index 2 after set :"+Bill1);
//       Bill1.remove(1);
//       System.out.println("After removal of index1 :"+Bill1);
//       int indexOf = Bill1.indexOf(40);
//       System.out.println("Index of value 40 :"+indexOf);
       boolean contains =Bill1.contains(100);
       System.out.println("Check for contains 100 :"+contains);
       Bill1.clear();
       System.out.println("Bill1 after clear :"+ Bill1);
       boolean isEmpty=Bill1.isEmpty();
       System.out.println("Result of isEmpty : "+isEmpty);
       
       Set <Integer> Bill2=new HashSet<Integer>();
       Bill2.add(10);
       Bill2.add(100);
       Bill2.add(200);
       Bill2.add(40);
       Bill1.addAll(Bill2);
       System.out.println("Bill1 after addAll :"+ Bill1);
       Bill1.retainAll(Bill2);
       System.out.println("Bill1 after retainAll :"+Bill1);
       Bill1.removeAll(Bill2);
       System.out.println("Bill1 after removeAll :"+ Bill1);
       
       
       
       
       
}
}