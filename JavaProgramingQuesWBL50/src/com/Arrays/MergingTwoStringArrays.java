package com.Arrays;


import java.util.ArrayList;
import java.util.Arrays;

public class MergingTwoStringArrays {
//The easy way is to convert the arrays into Lists, add one into another and 
	//finally convert back to an array.
	public static void main(String[] args) {
		
		    String a[] = {"a", "b", "c"};
		    String b[] = {"d", "e" };

		    ArrayList<String> list = new ArrayList<String>(Arrays.asList(a));
		    list.addAll(Arrays.asList(b));
		    Object [] c = list.toArray();
		    System.out.println(Arrays.toString(c));
		    /*
		     output :  [a, b, c, d, e]
		    */
		    
		    
		    }
		  }
		
	


