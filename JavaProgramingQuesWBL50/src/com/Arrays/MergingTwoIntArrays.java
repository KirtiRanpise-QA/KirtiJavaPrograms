package com.Arrays;

import java.util.Arrays;

public class MergingTwoIntArrays {

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 4 };
		int arr2[] = { 6, 7, 8, 9 };

		int[] arr3 = mergeArrays(arr1, arr2);

		// sort the arrays using Arrayssort.sortArrays()

		Arrays.sort(arr3);
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}

	}

	public static int[] mergeArrays(int arr1[], int arr2[]) {

		int arr3[] = new int[arr1.length + arr2.length];

		// copy arrays into the newly allocated arrays

		for (int i = 0; i < arr1.length; i++) 
			arr3[i] = arr1[i];
			for (int j = 0; j < arr2.length; j++) 
			arr3[j + arr1.length] = arr2[j];
          
			
				
		return arr3;
		
	}
}
