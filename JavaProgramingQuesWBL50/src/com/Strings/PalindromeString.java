package com.Strings;

public class PalindromeString {

	public static void main(String[] args) {
		String s = "wow";
		String reverse = "";
		
		for( int i= s.length()-1; i>=0; i-- ){
			reverse= reverse + s.charAt( i);
			
		}
System.out.println(reverse);
	
if(s.equals( reverse)){
	System.out.println("String is Palindrome");
}
else{
	System.out.println("String is not palindrome");
}	
}
}
