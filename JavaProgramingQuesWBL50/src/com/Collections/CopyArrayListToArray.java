package com.Collections;

import java.util.ArrayList;

public class CopyArrayListToArray {
//Here we can see example for copying all content of ArrayList to an array. 
	//You can get this done by calling toArray() method.
	public static void main(String[] args) {
		ArrayList <String> arrl= new ArrayList<String>();
		arrl.add( "first");
		arrl.add( "second");
		arrl.add( "third");
		arrl.add( "fourth");
		arrl.add( "fifth");
		
System.out.println("Elements in arraylist are: "+ arrl);
String [] arrstr= new String[arrl.size()];

arrl.toArray(arrstr);
System.out.println("Created array content");
for(String str: arrstr)
System.out.println(str);
	}

}
