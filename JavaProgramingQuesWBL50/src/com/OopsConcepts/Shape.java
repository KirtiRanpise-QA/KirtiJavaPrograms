package com.OopsConcepts;
/*
* Write a program creating an abstract class Shape with properties (noOfSides, area, perimeter) 
* and methods(calculateArea, calculatePerimeter, setSides)

*/
public  abstract class Shape {
 protected int noOfSides;
 protected double area;
 protected double perimeter;
 
 public abstract double calculateArea();
 public abstract double calcualatePerimeter();
 public abstract void setSides();

 
}
