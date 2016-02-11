package com.Arrays;

public class SmallestNumInArray {

	public static void main(String[] args) {
		int a []= {32, 87,99,216,502,12,89,112};
		int min= a[0];
		for (int i = 0; i<= a.length-1; i++){
			if(min>= a[i]){
				min= a[i];
				
			}
		}
System.out.println("Minimum number in given array: " + min);
	}

}
