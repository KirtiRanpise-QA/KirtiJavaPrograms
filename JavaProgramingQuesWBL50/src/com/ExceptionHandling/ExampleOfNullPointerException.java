package com.ExceptionHandling;

public class ExampleOfNullPointerException {
@SuppressWarnings("null")
public static void main(String[] args) {
	
	try{
		  String str= null;
		 System.out.println(str.length());
	}
	catch(NullPointerException e){
		System.out.println("NullPointerException occured");
	}
}
}
/*Here, length() is the function, which should be used on an object. 
 * However in the above example String object str is null so it is not an object due to which NullPointerException occurred.
 * 
 */
