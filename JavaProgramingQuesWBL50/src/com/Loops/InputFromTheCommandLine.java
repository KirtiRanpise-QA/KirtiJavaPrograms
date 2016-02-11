package com.Loops;

import java.io.InputStreamReader;
import java.util.Scanner;

/*Java 5 introduced a nice utility called java.util.Scanner which is capable to read input form command line in Java. 
 * Using Scanner is nice and clean way of retrieving user input from console or command line. Scanner can accept 
 * InputStream, Reader or simply path of file from where to read input. In order to reading from command line we can 
 * pass System.in into Scanner's constructor as source of input. Scanner offers several benefit over classical 
 * BufferedReader approach, here are some of benefits of using java.util.Scanner for reading input from command 
 * line in Java:
1) Scanner supports regular expression, which gives you power to read only matching pattern from input.
2) Scanner has methods like nextInt(), nextFloat() which can be used to read numeric input from command line and can be 
directly used in code without using Integer.parseInt() or any other parsing logic to convert String to Integer or String to double for floating point input.
 * 
 */
public class InputFromTheCommandLine {
	public static void main(String[] args) {
		//Java program to read input from command prompt in Java

		Scanner scan= new Scanner(System.in);//or
		//Scanner scan= new Scanner(new InputStreamReader (System.in));
		System.out.println("Reading input from console using scanner in java ");
		System.out.println("Please enter your input ");
		String input= scan.nextLine();
		System.out.println("User input from console = " + input);
		
		System.out.println("Reading int from console in java ");
		
		int number= scan.nextInt();
		System.out.println("integer input = " + number);
	} 
}
