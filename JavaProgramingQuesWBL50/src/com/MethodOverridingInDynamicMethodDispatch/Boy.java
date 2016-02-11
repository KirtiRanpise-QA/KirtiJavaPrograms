package com.MethodOverridingInDynamicMethodDispatch;

public class Boy extends Parent {
public void eat(){
	System.out.println("eat()of boy class");
}
public void play(){
	System.out.println("Boy is playing tennis");
}

public static void main(String[] args) {
	//parent class reference to child class
	Parent obj= new Boy();
	obj.eat();
	obj.read();
	
}
/*In dynamic method dispatch the object can call the overriding methods of child class and all the non-overridden methods of base 
 * class but it cannot call the methods which are newly declared in the child class. In the above example the object obj was able 
 * to call the eat()(overriding method) and read()(non-overridden method of base class). However if you try to call the play() method 
 (which has been newly declared in Boy class) [obj.play()] then it would give compilation error
  */
}
