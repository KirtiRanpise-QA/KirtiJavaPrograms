package com.Arrays;

import java.util.Scanner;

//Write a program to perform a linear search on any given array.
//Linear search is the basic search where you look for the element to be searched in a 
//sequential way.
public class LinearSearchOnGivenArray {

	public static void main(String[] args) {

		int c, n, search, array[];

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number of elements");
		n = scan.nextInt();
		array = new int[n];
		System.out.println("Enter " + n + " integers");

		for (c = 0; c < n; c++)
			array[c] = scan.nextInt();

		System.out.println("Enter value to find");
		search = scan.nextInt();

		for (c = 0; c < n; c++) {
			if (array[c] == search) /* Searching element is present */
			{
				System.out.println(search + " is present at location "
						+ (c + 1) + ".");
				break;
			}

		}
		if (c == n) /* Searching element is absent */
		{
			System.out.println(search + " is not present in array.");
		}
		scan.close();
	}
}
