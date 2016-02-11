package com.File;

import java.io.BufferedReader;
import java.io.Console;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
* Write a program that takes input from user dynamically using below 
* *	classes.
*	--> Scanner: Use this class to input 2 integer numbers and sum them.
*	--> BufferedReader and InputStreamReader: Use this classes to input 
*		2 integer numbers and subtract them.
*	--> DataInputStream: Use this class t
*o input 2 integer numbers and 
*		multiply them.
*	--> Console: Use this class to input 2 integer numbers and divide them.
*/
public class DataInput {
private static int num1;
private static int num2;

public static void useScanner(){
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter your first number");
	num1= scan.nextInt();
	
	System.out.println("Enter your second number");
	num2= scan.nextInt();
	  int result= num1+num2;
	System.out.println( "Sum of given two nos is: "+ result);
	scan.close();
	
}

public static void useBufferedReader() throws IOException{
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter your first number");
	String s1= br.readLine();
	num1= Integer.valueOf( s1);
	System.out.println("Enter your second number");
	String s2= br.readLine();
	num2= Integer.valueOf( s2);
	System.out.println( "Sum of given two nos is: "+ (num1-num2));
	}
 
public static void useDataInputStream() throws IOException{
	 DataInputStream dis= new DataInputStream(System.in);
	 System.out.println("Enter your first number");
	 @SuppressWarnings("deprecation")
	String s1= dis.readLine();
		num1= Integer.valueOf( s1);
		System.out.println(num1);
	System.out.println("Enter your second number");
	String s2= dis.readLine();
	num2= Integer.valueOf( s2);
		System.out.println(num2);
		System.out.println( "Multiplication of given two nos is: "+ (num1*num2));
 }

public static void useConsole()
{
	Console cnsl = System.console();
	if(cnsl != null)
	{
	
		String s1 = cnsl.readLine("Enter first number:");
		num1 = Integer.valueOf( s1);
		// or num1 = Integer.parseInt(s1);
		String s2 = cnsl.readLine("Enter second number:");
		num2 = Integer.parseInt(s2);
		
		System.out.println("Division of given nos =  " + (num1 / num2));
	}
	else
	{
		System.out.println("Null console");
		return;
	}
		
	}


public static void main(String[] args) throws IOException {
	//DataInput.useScanner();
	//DataInput.useBufferedReader();
	//DataInput.useDataInputStream();
	DataInput.useConsole();
}
}
