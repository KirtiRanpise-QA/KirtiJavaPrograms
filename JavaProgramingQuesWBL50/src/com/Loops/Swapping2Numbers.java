package com.Loops;

import java.util.Scanner;

/*Write a program that swaps 2 given numbers. You need to have 2 separate functions in the program.
+   --> One Function should swap the numbers without any third new variable.
+   --> Second function should swap the numbers using a third variable.
 */
public class Swapping2Numbers {

	public static void main(String[] args) {
		//swap the numbers without any third new variable.
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter your first no");
		int a= scan.nextInt();
		System.out.println("Enter your second no");
		int b= scan.nextInt();
		System.out.println("value of a and b before swapping a: " +a +" b: " +b);
		//if a= 10 and b= 20
		a= a+b;//now a= 30
		b= a-b;//now b= 10 which is original value of a
		a=a-b;//now a= 20 which is original value of b
		System.out.println("value of a and after swapping a: " +a +" b: " +b);
//Swapping two numbers without using temp variable in Java with division and multiplication
		
		/*int c = 5;
		int d = 8;

		System.out.println("value of a and b before swapping, c: " + c +" d: " + d);

		//swapping value of two numbers without using temp variable using multiplication and division
		c = c*d; //now c is 40 and d is 8
		d= c/d; //now c is 40 but d is 5 (original value of c)
		c = c/d; //now c is 8 and b is 5, numbers are swapped

		System.out.println("value of a and b after swapping using multiplication and division, c: " + c +" d: " + d);

		*/
	//Second function should swap the numbers using a third variable.
		int x, y , temp;
		
		Scanner scan1 = new Scanner (System.in);
		System.out.println("Enter the value of x and y");
		x= scan1.nextInt();
		y= scan1.nextInt();
		System.out.println("Value of x and y before swapping x: " +x + " y: " +y);
		//if x= 4 and y= 5
		temp = x;// now temp is 4
		x=y;// now x= 5 original of y
		y= temp;//now y=4 original of x
		
		System.out.println("After Swapping  x: " +x + "y "+ y);
		
		
		
	}

}
