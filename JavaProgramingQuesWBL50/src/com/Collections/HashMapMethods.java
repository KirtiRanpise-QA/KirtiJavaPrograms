package com.Collections;

import java.util.HashMap;
import java.util.Map;

/*Write a program having below methods.
+  			--> To create a hashmap.
+  			--> To search for a key in the created map and then returns its value.
 */
public class HashMapMethods {

	public static void main(String[] args) {
		System.out.println("Map= " + HashMapMethods.createHashMap());
		HashMap <String ,Integer >m= (HashMap<String , Integer >) createHashMap();
		String Key= "Mona";
		System.out.println("Value for key " + Key + " = " + getKeyValue(m, Key));
}
public static Map<String , Integer >createHashMap(){
	Map<String , Integer > m = new HashMap <String ,  Integer >();
	m.put( "Priya",  10);
	m.put( "Uma",  12);
	m.put( "Asha",  15);
	m.put( "Mona",  18);	
	m.put( "Anna",  21);
	
	return m;
}
public static int getKeyValue(HashMap <String ,Integer >m, String hkey){
	return m.get( hkey);
}
}

