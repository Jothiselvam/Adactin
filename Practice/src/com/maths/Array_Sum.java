package com.maths;

public class Array_Sum {
	public static void main(String[] args) {

		int arr1[][] = { { 10, 20, 30 }, { 30, 40, 50 } };

		int arr2[][] = { { 20, 30, 40 }, { 40, 50, 60 } };

		int c[] = new int[arr1.length];
		if (arr1.length == arr2.length) {

			for (int i = 1; i < arr1.length-1; i++) {
				for (int j = 1; j <= i; j++) {
					for (int k = 1; k <= j; k++) {

						c[k] = arr1[i][j] + arr2[i][j];

						System.out.print(c[k]);
					}

				}

			}
		}
	}
}
