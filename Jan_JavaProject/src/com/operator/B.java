package com.operator;
import java.util.Scanner;
public class B {



public static void main(String[]args) {
	int i=1;
	for (i=1;i<=3;i++) {
	System.out.println("Enter the day");
	Scanner a= new Scanner(System.in);
	
	int day= a.nextInt();
	System.out.println(day);
	
	switch (day) {
	case 1:
		System.out.println("Monday");
		break;
	case 2:
			System.out.println("Tuesday");
			break;
	case 3:
				System.out.println("Wednesday");
				break;
	
				default:
	
	}
	}
}}
