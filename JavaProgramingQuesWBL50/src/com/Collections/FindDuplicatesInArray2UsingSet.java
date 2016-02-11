package com.Collections;

import java.util.HashSet;

public class FindDuplicatesInArray2UsingSet {

	public static void main(String[] args) {
		int [] a= {2, 8, 5, 3, 7 ,5, 12, 10, 8, 12};
		HashSet<Integer> set = new HashSet <Integer>();
		for (int i = 0; i<a.length; i++){
			
            //If same integer is already present then add method will return FALSE
		if(set.add(a[i])==false){
			System.out.println("Duplicate Element: "+ a[i]);
		}	
		}
		

	}

}
