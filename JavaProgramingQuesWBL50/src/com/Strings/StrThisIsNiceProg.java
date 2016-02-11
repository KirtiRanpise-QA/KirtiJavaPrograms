package com.Strings;

import java.util.Scanner;

//Write a program which accepts a string like "This is nice" and converts it to a string 
//like "This1 is2 nice3"
public class StrThisIsNiceProg {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your String");
		String s= scan.nextLine();
		System.out.println(s);

	String fSubStr= s.substring( 0,  4);
	String p= "1";
	String Firstword= fSubStr + p;
	//System.out.println(Firstword);
	
	String secSubStr= s.substring( 5,  7);
	String q= "2";
	String Secword= secSubStr + q;
	
	String thirdSubStr= s.substring( 8,  12);
	String r= "3";
	String Thirdword= thirdSubStr + r;
	
	String Final= Firstword +" "  + Secword +" " +Thirdword + " ";
	System.out.println(Final);
	scan.close();
	
}
}