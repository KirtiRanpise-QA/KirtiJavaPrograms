/* Write a program that prints a fibonacci series that is a sequence of numbers like0 1 1 2 3 5 8.
 * You can vary the number of elements to be printed meaning you can print 10 numbers or 15 or 20 
 * or any desired number.
 * package com.WhiteBox.nov3;

import java.util.Scanner;

public class PrintFibonacciSereis {

	public static void main(String[] args) {
		int first = 0;
		int second = 1;
		int next;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your no of terms for fibonacci sereis ");
		int noOfTerms = scan.nextInt();

		System.out.print(first + " " + second);
		int sum = 0;
		for (int count = 3; count <= noOfTerms; count++) {
			next = first + second;
			System.out.print(" " + next);
			sum = sum + next;
			first = second;
			second = next;

		}
		System.out.println("\nsum of nos is " + sum);
	}

}
 
 */

package com.Loops;

import java.util.Scanner;

public class PrintFibonacciSeries {

	public static void main(String[] args) {
		int First= 0;
		int Second= 1;
		int next;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Number for fibonacci series");
		int Number= scan.nextInt();
		
		System.out.print(First+ " "+Second);
		
		int sum= 0;
		for(int i= 0; i<= Number; i++){
			next= First+ Second;
			System.out.print("  "+ next);
			First= Second;
			Second= next;
			sum= sum+ next;
		}
		System.out.println("\nTotal sum is "  + sum);

	}

}
