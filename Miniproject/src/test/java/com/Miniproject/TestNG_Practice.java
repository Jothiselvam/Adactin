package com.Miniproject;

import org.testng.annotations.Test;

public class TestNG_Practice {
	@Test(priority=1)
	public static void left_triangle() {
	for (int i=1;i<=5;i++) {
		for(int j=1;j>i;j--) {
			System.out.print(" ");
			
		}
		for(int k=1;k<=(i*2)-1;k++) {
			System.out.print("*");
		}
		System.out.println();
	}
}


	@Test
	public static void triangle() {
	for (int i = 1; i<=5; i++) {
		for (int j=5;j>i; j--) {
			System.out.print(" ");
		}
		for (int k=1; k<=(i * 2) - 1; k++) {
			System.out.print("*");
		}
		System.out.println();

	}
}
@Test(priority=0)
public static void diamond() {
	
	for (int i=1; i<=5; i++) 
    { 
        // Print space in decreasing order 
        for (int j=5; j>i; j--)
        {
            System.out.print(" ");
        }
        // Print star in increasing order
        for (int k=1; k<=(i * 2) -1; k++) 
        { 
           System.out.print("*"); 
        } 
        System.out.println(); 
    } 
    for (int i=4; i>=1; i--)
    {
     // Print space in increasing order
        for (int j=4; j>=i; j--)
        {
            System.out.print(" ");
        }
        // Print star in decreasing order
        for (int k=1; k<=(i * 2) -1; k++)
        {
            System.out.print("*");
        }
        
        System.out.println();
    }
	}
}

