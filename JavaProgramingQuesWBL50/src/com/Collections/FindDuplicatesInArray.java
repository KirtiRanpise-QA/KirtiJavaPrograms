package com.Collections;

import java.util.HashSet;

public class FindDuplicatesInArray {

	public static void main(String[] args) {

		String[] input = {"Jan", "Feb", "Jan", "March", "Dec", "Nov", "Jan", "Feb", "June"};
	
		findDuplicates(input);
		
		

	}
	
		
		public static void findDuplicates(String[] strArray)
		{
			 
	        HashSet<String> set = new HashSet<String>();
	 
	        for (String str : strArray)
	        {

	            //If same String is already present then add method will return FALSE
	            if(set.add(str)==false) //duplicate  OR
	            	//if(!set.add(str))
	            {
	                System.out.println("Duplicate element: " + str);
	            }
	        }
			
		}
		}


