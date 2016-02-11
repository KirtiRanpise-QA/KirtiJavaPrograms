package com.General;
/*Write a program to print 1 to 10 numbers without using loops and you should not have more than 1 print statement.
 * 
 */
public class PrintNumbersWithoutLoop {

	private static int count = 1;
public static void printToCount(){
	if(count<= 10)
	{
		System.out.println(count++);
		//using recursion:function calling itself
	printToCount();
	}
}
public static void main(String[] args) {
	PrintNumbersWithoutLoop.printToCount();
}
}
