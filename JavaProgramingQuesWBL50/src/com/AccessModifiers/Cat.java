package com.AccessModifiers;

public class Cat extends Animal{

	@Override
	public void move() {
		System.out.println("walking");
		
	}
public static void main(String[] args) {
	Cat c = new Cat();
	c.eat();
	System.out.println(c.isPet);
	c.sleep();
	c.move();
}
}
