package com.General;
/*There are many immutable classes like String, Boolean, Byte, Short, Integer, Long, Float, Double etc. In short, all the wrapper 
 * classes and String class is immutable. We can also create immutable class by creating final class that have final data members 
 * as the example given below:
 */

//Here, we have created a final class named Employee. It have one final datamember, a parameterized constructor and getter method.

public final class EmployeeImmutableClass {


	final String FirstName;
	
	public EmployeeImmutableClass(String FirstName ){
		this.FirstName= FirstName;
	}
	public String getFirstName(){
		return FirstName;
	}
	public static void main(String[] args) {
		EmployeeImmutableClass obj= new EmployeeImmutableClass("Kirti");
		System.out.println(obj.getFirstName());
	}
	
	/*The above class is immutable because:
The instance variable of the class is final i.e. we cannot change the value of it after creating an object.
The class is final so we cannot create the subclass.
There is no setter methods i.e. we have no option to change the value of the instance variable.
	 * 
	 */
}
