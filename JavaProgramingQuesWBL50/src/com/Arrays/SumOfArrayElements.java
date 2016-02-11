package com.Arrays;

public class SumOfArrayElements {

	public static void main(String[] args) {
		int a [] ={10,20,30,40,15};
		int sum= 0;
		
		for(int i= 0; i<a.length;i++){
			sum = sum+ a[i];
			
		}
System.out.println("Sum of nos in given array:  " + sum);
	}

}
