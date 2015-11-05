package javaProgramingExercises;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample2 {

	public static void main(String[] args) {
		// create new arraylist
		ArrayList<Integer> alist= new ArrayList<Integer>();
		
		// add three elements
		alist.add( 10);
		alist.add( 20);
		alist.add( 25);
		
		//get size and display
		int count = alist.size();
		System.out.println("Count: " +count);

		//search for an element in list
		System.out.println("First element is "+ alist.get( 0));
		System.out.println("Second element is "+ alist.get( 1));
		System.out.println("Third  element is "+ alist.get( 2));
		
		//'for each' loop to loop thru elements and print them all
		for(Integer s :alist){
			
		System.out.println("Element " + s);	
		}
		//simple for loop
		for(int i = 0;i<alist.size(); i++){
			int value= alist.get( i);
			System.out.println("Element = "+ value);
		}
		//to print the elements of the list using iterator
			Iterator<Integer> it= alist.iterator();
			while (it.hasNext()){
				System.out.println("Element: " +it.next());
			
		}
			//System.out.println("done");
		}
	}



