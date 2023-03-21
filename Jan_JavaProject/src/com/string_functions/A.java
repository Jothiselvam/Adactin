package com.string_functions;

public class A {
	public static void main(String[]args) {
		String a=("Sai Arudra");
		
		int length = a.length();
		System.out.println(length);
		
		boolean equals = a.equals("Jothi");
		System.out.println(equals);
		
		boolean equalsIgnoreCase = a.equalsIgnoreCase("sai arudra");
		System.out.println(equalsIgnoreCase);
		
		String upperCase = a.toUpperCase();
		System.out.println(upperCase);
		
		String lowercase = a.toLowerCase();
		System.out.println(lowercase);
		
		boolean startsWith = a.startsWith("S");
		System.out.println(startsWith);
		
		boolean endsWith = a.endsWith("a");
		System.out.println(endsWith);
		
		boolean contains = a.contains("Arudra");
		System.out.println(contains);
		
		int indexOf = a.indexOf("S");
		System.out.println(indexOf);
		
		int lastIndexOf = a.lastIndexOf("a");
		System.out.println(lastIndexOf);
		
		char charAt = a.charAt(4);
		System.out.println(charAt);
		
		
		String replaceString = a.replace('d','t');
		System.out.println(replaceString);
		
		String substring = a.substring(0,3);
		System.out.println(substring);
		
		boolean empty = a.isEmpty();
		System.out.println(empty);
		
		//String[] split = a.split(substring);
		//System.out.println(split);
		
		//String trim = a.trim();
		//System.out.println(trim);
		
		String concat = a.concat(" Arun");
		System.out.println(concat);
		
		
		
		
	}

	
}
