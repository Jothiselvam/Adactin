package com.maths;

public class Diamond_Star {
	public static void main(String[] args) {
		
	

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