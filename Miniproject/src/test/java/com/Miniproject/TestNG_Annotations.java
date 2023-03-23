package com.Miniproject;

import org.testng.annotations.Test;

public class TestNG_Annotations {
	@Test(groups="a")
	public static void student1() {
		System.out.println("Grade A");
	}
	@Test(groups="b")
	public static void student2() {
		System.out.println("Grade C");
	}
	@Test(groups="a")
	public static void student3() {
		System.out.println("Grade S");
	}
	@Test(groups="c")
	public static void student4() {
		System.out.println("Grade B");
	}
	@Test(groups="a")
	public static void student5() {
		System.out.println("Grade A");
	}
}
