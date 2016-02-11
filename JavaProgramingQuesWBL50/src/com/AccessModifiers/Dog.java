package com.AccessModifiers;

public class Dog extends Animal{
private int NumOfLegs;
private boolean hasOwner;

public Dog(){
	NumOfLegs= 4;
	hasOwner= true;
}
	
	public void makeDogBark(){
	//Dog d= new Dog();
	bark();
	}
	private void bark(){
		System.out.println("Woof");
	}
	public void makeDogEat(){
		eat();
	}

@Override
	public void move() {
	System.out.println("running");
		
	}
public static void main(String[] args) {
	Dog d= new Dog();
	d.bark();
	d.makeDogBark();
}
}
