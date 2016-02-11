package com.Loops;

import java.util.Scanner;

/*A prime number (or prime integer, often simply called a "prime" for short) is a positive integer that has no 
 * positive integer divisors other than 1 and itself
 * 
 */
public class NumberIsPrimeOrNot {

	public static void main(String[] args) {
	//create a scanner object
		Scanner scan= new Scanner(System.in);
		System.out.println("enter your number");
		
		//store user input in variable
		int num = scan.nextInt();
		
		boolean isPrime= true;
	
		for(int i= 2; i<= num/2; i++){
			if(num%i==0)
			{
				isPrime= false;
				break;
			}
			
		}
if(isPrime){
	System.out.println(num + " is a prime number");
	
}
else{
	System.out.println("not a Prime number");
}
	}

}
