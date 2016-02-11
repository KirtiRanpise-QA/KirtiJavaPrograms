package com.Arrays;

//Write a program to find the common number in any given two arrays.
public class FindCommonElementsIn2Arrays {

	public static void main(String[] args) {
		int[] a = { 12, 14, 20, 25, 60, 67, 111, 103, 520 };
		int[] b = { 14, 13, 18, 60, 108, 112, 520, 65, 20 };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}

}
