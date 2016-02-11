

package com.Collections;
import java.util.*;

/* Write a program having different methods to perform below operations.
+  			--> To create an arraylist and add elements to it.
+  			--> To search for an element in the list.
+  			--> To print the elements of the list using iterator.
+  			--> To print the elements in the reverse order using ListIterator.
 */
public class ArrayListOperations{
public static void main(String[] args) {
	//to declare arraylist in java, just use the keyword "arraylist"
	ArrayList<Integer> mylist= new ArrayList<Integer>(5);
	mylist.add( 12);
	mylist.add( 14);
	mylist.add( 16);
	mylist.add( 18);
	mylist.add( 20);
	
	System.out.println( "My List is: " +mylist);
	
	//To search for an element in the list.
	 mylist.get( 1);
	 System.out.println("second element is :" + mylist.get( 1));
	 
	 
	//to print the elements of the list using iterator
	
		Iterator<Integer> it= mylist.iterator();
		while(it.hasNext()){
			System.out.println("Element :" + it.next());
			
		}
		//To print the elements in the reverse order using ListIterator.
				ListIterator< Integer> listit= mylist.listIterator();
				while(listit.hasNext()){
					System.out.println("Element is = " +listit.next());
			}
				// to reverse
				System.out.println("list in reverse");
				while (listit.hasPrevious()){
				System.out.println("Element :"+ listit.previous());
				
	}
}
}
		
	


	
	



			