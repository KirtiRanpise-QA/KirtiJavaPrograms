package com.OopsConcepts;

public class MethodOverloadingDiffNumOfArgs {

	public static void main(String[] args) {
		
		MethodOverloadingDiffNumOfArgs obj= new MethodOverloadingDiffNumOfArgs();
		obj.displayArg('a');
		obj.displayArg('a', 12);
	}

	
	
	public void displayArg(char c){
	System.out.println(c);
}
public void displayArg(char c, int num){
	System.out.println(c + " "+ num);
}
}


/*In the above example – method displayArg() has been overloaded based on the number of arguments – We have two definition of method 
 * displayArg(), one with one argument and another with two arguments.
 */
