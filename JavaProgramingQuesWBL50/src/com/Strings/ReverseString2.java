package com.Strings;

public class ReverseString2 {

	public static void main(String[] args) {
		String s= "This is my car ", reverse= "";
		
		for(int i = s.length()-1; i>= 0;i--){
			reverse= reverse+ s.charAt( i);
		}
			System.out.println("Reversed String is: " + reverse);
			
		
	if(s.equals(reverse)){
		System.out.println("String is palindrome");
	}
	else{
		System.out.println("String is not palindrome");
	}
		
	}
}

