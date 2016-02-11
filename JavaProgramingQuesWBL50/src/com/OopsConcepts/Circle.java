package com.OopsConcepts;
/*
 * Write a program that creates a class Circle extending Shape abstract class and 
 * implementing ShapeConstants interface and has following behavior.
 * 			--> Properties: radius.
 *			--> Constructor: To set number of sides.
 *			--> Overrides all the methods from parents.
 */
public class Circle extends Shape implements ShapeConstants {
	
	private final double radius;
	
	public Circle (double radius){
		this.radius= radius;
	}

	@Override
	public double calculateArea() {
		
		return (this.area= (ShapeConstants.PI * Math.pow(radius, 2)));
	}

	@Override
	public double calcualatePerimeter() {
		
		return(this.perimeter = (2 * (ShapeConstants.PI) * radius));
	}
	

	@Override
	public void setSides() {
		
		this.noOfSides = 0;
		
}
	public static void main(String[] args) {
		Circle c= new Circle(6);
		System.out.println("Area of Circle= " + c.calculateArea());
		System.out.println("Perimeter of Circle= "+ c.calcualatePerimeter());
		
	}

}
