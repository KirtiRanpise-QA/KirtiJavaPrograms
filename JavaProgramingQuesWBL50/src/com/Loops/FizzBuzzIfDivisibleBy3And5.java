package com.Loops;

/*Print the numbers 1 – 100
If a number is divisible by 3, the program should print the word “Fizz”
If a number is divisible by 5, the program should print the word “Buzz”
If a number is divisible by both 3 and 5, it should print the word “FizzBuzz”
 * 
 */

public class FizzBuzzIfDivisibleBy3And5 {

	public static void main(String[] args) {
		//Use a "for loop" to print the numbers 1 - 100 to the screen/console,
	    //as we know how many numbers will be printed at runtime.
	    for(int i = 1; i <= 100; i++){
	 
	            //Check to see if a number is divisible by 3 and 5, which is done
	            //first because checking for divisibility for either 3 or 5 first
	            //would cause either "Fizz" or "Buzz" to be printed instead
	            if(i % 3 == 0 && i % 5 == 0){
	                System.out.println("FizzBuzz");
	            }
	            //Check for divisibility by 3 and print "Fizz" if true
	            else if(i % 3 == 0){
	               System.out.println("Fizz");
	            }
	            //Check for divisibility by 5 and print "Buzz" if true
	            else if(i % 5 == 0){
	                System.out.println("Buzz");
	            }
	            //If a number is not divisible by 3 or 5, print it normally
	            else{
	                System.out.println(i);
	            }
		
	}

}
}
