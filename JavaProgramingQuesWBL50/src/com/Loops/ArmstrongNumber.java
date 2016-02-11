package com.Loops;
/*Write a program  to check an armstrong number i.e. whether the if we power up the each individual number to the total 
 * number of digits in the number and add them it should be equal to the number itself. For example 153 has 3 digits in 
 * it and if we do 1^3+5^3+3^3=153.
+    		FYI: ^ means is to the power.
 * 
 */
import java.util.*;
public class ArmstrongNumber {

	public static void main(String[] args) {
		int n, temp, sum=0, r;//r for remainder
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your number");
		n= scan.nextInt();
		
		temp= n;
		while(temp!=0)
		{
			r= temp%10;
			sum = sum + r*r*r;
			temp= temp/10;
			
		}
		if(n==sum)
		{
		System.out.println("Entered number is a Armstrong no.");	
		}
		else{
			System.out.println("Entered number is not a armstrong number");
		}
scan.close();
	}

}
