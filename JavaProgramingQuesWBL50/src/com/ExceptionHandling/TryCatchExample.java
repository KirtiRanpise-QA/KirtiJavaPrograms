package com.
ExceptionHandling;

public class TryCatchExample {

	public static void main(String[] args) {
		int num1  ;
		
		try{
			//Try block to handle code that may cause exception
	        num1 = 0;
		num1= 0;
		int num2= 12/num1;
		System.out.println(num2);
		}
		catch(ArithmeticException e)
		{
			//This block is to catch divide-by-zero error
		System.out.println("Error: Don't divide the number by Zero");	
		}
		
finally{
	System.out.println(" I am out of try catch block");
}
	}

}
