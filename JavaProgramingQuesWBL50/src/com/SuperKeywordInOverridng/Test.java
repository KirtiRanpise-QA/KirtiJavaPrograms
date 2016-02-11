package com.SuperKeywordInOverridng;
/*super keyword is used for calling the parent class method/constructor. 
 * super.methodname() calling the specified method of base class while super() calls the constructor of base class. 
 * Let’s see the use of super in Overriding.
 * 
 */
public class Test extends ABC {
public void myMethod(){
	//This will call myMethod()of parent class
	super.myMethod();
	System.out.println("Class Test: myMethod()");
	
}
public static void main(String[] args) {
	Test obj = new Test();
	obj.myMethod();
}
}

