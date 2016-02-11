package com.Loops;

import java.util.Scanner;

/*Recursion is a basic programming technique you can use in Java, in which a method calls itself to solve some problem. 
 A method that uses this technique is recursive. Many programming problems can be solved only by recursion, and some 
 problems that can be solved by other techniques are better solved by recursion.

 One of the classic problems for introducing recursion is calculating the factorial of an integer. 
 The factorial of any given integer — call it n so that you sound mathematical — is the product of all the integers from 
 1 to n. Thus, the factorial of 5 is 120: 5 x 4 x 3 x 2 x 1.

 The recursive way to look at the factorial problem is to realize that the factorial for any given number n is equal to
 n times the factorial of n–1, provided that n is greater than 1. If n is 1, the factorial of n is 1.
 */
public class FindFactorialOfNumUsingRecursion {

	public static void main(String[] args) {
	System.out.println(factorial(5));	
	}
	public static int factorial(int N){
		if (N<=1){
			return 1;
		}
		else return (N* factorial(N-1));
	

	}
}
/*//		// scanner object for capturing the user input
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter your number to calcualte its factorial");
//
//		// stored the value in variable
//		int num = scan.nextInt();
//
//		// called the user defined function fact
//		int factorial = fact(num);
//		System.out.println("Factorial of a number is: "+ factorial);
//		scan.close();
//	}
//
//	// function
//	static int fact(int n) {
//		int output;
//		if (n == 1) {
//			return 1;
//		}
//		// Recursion: function calling itself
//		output = fact(n - 1) * n;
		return output;*/
	
	

