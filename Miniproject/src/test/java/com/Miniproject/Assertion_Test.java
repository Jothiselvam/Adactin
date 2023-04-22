package com.Miniproject;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class Assertion_Test {
	//verification(Soft assert)
	
	@Test
	private void soft_assert() {
		String student1="Sai";
		String student2="Muthra";
		System.out.println("Went to school");
		SoftAssert s=new SoftAssert();
		s.assertEquals(student1, student2);
		System.out.println("Went to college");
	}
	
	
    private void hard_assert() {
	String student1="Sai";
	String student2="Sai";
	System.out.println("Went to school");
	Assert.assertEquals(student1, student2);
	System.out.println("Went to college");
}
	

}
