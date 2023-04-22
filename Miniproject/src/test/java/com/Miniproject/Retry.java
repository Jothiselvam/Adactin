package com.Miniproject;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Retry {
	
	
    @Test(retryAnalyzer=Retry_Demo.class)
	private void retry_analyzer() {
		String student1="Sai";
		String student2="Muthra";
		Assert.assertEquals(student1, student2);
		System.out.println("Went to college");
	}
	

}
