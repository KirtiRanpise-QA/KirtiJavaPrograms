package com.AccessModifiers;

public abstract class Animal  {
public boolean isPet= true;
public String Owner= "Sam";

public void sleep(){
	System.out.println("sleeping");
}
public void eat(){
	System.out.println("eating");
}
public abstract void move();

}