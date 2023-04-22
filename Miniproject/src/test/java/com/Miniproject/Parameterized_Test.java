package com.Miniproject;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Test {
	
	@Test
	@Parameters({"Student Name","CGPA"})
	private void result(@Optional String a, @Optional float b) {
		System.out.println(a);
		System.out.println(b);
		
	}

}
