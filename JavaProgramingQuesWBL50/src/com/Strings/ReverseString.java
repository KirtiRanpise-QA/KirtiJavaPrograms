package com.Strings;
/*Write a program to reverse a string.Donot use StringBuffer/StringBuilder inbuilt 
 reverse function.
  */
public class ReverseString {

	public static void main(String[] args) {
	String input = "This is my car ";
	
	System.out.println(" Reversed String: " + reverseString(input) );
if(input.equals(reverseString(input))){
	System.out.println("Given String is palindrome");
	}
else{
	System.out.println("String is not palindrome");
}
}

	public static String reverseString(String inStr){
		
		 String OutStr = "";
		 
		
		try{
			
			int i = inStr.trim().length() - 1;
			while(i>= 0){
				OutStr= OutStr + inStr.charAt(i);
				i--;
			}
			}
		catch(Exception e){
		System.out.println(e.toString());
		e.printStackTrace();
		}
		return OutStr;
	}
}
