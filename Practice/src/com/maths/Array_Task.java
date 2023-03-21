package com.maths;

public class Array_Task {
	public static void main(String[] args) {
		int arr[]=   {0,1,2,4,5,8,10,4,3,14,12,7};
		for(int i=0; i<=arr.length-1;i++) {
			
			for(int j=0;j<=i;j++) {
				
				int sum=arr[i]+arr[j];
			
			int target=8;
			
			if(sum==target) {
				System.out.print("{"+arr[i]+" ,"+ arr[j]+"}"+",");
				
			}
		}
		
	}

}
}