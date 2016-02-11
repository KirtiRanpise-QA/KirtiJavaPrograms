package com.General;
/*
 *  Write a program that contains a constructor, a static block and a static method. 
 *  Execute the program in order to verify the order of execution of methods and block.
 */
public class StaticDemo {
private static int testCode;
private static String testString;

StaticDemo(int testCode,String testString){
	this.testCode= testCode;
	this.testString= testString;
	System.out.println("static variables are initiallized in constructor");
}
static{
	System.out.println("In static block ");
	setTestValue(12, " Test 12");
}

private static void setTestValue(int testCode,String testString){
	StaticDemo.testCode= testCode;
	StaticDemo.testString= testString;
}

public static String getTestValues()
{
	String str = null;
	str = testCode + " " +  testString;
	return str;
}
public static void main(String[] args) {
//calling constructor
	new StaticDemo(15, "Test 15");
	
	System.out.println(getTestValues());
	
	setTestValue(30, "Test 30");
	
	System.out.println(getTestValues());
}
}
