package com.maths;

public class Array_Sorting {
	public static void main(String[] args) {

		int a[] = { 10, 30, 70, 20, 80, 50 };
		System.out.println("Before Sorting");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				int temp = 0;
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("After Sorting");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
