package com.maths;

public class Blood_Task {
	public static void main(String[] args) {
		int RBC=50;
	
if (RBC<=100 && RBC>=91) {
	System.out.println("Group A+");
}
else if(RBC<=90 && RBC>=81){
	System.out.println("Group A-");
}
else if (RBC<=80 && RBC>=71) {
	System.out.println("Group B+");
}
else if (RBC<=70 && RBC>=61) {
	System.out.println("Group B-");
}
else if (RBC<=60 && RBC>=51) {
	System.out.println("Group AB+");
}
else if (RBC<=50 && RBC>=41) {
	System.out.println("Group AB-");
}
else if (RBC<=40 && RBC>=31) {
	System.out.println("Group O+");
}
else if (RBC<=30 && RBC>=21) {
	System.out.println("Group O-");
}
else {
	System.out.println("Not Defined");
}
}
}