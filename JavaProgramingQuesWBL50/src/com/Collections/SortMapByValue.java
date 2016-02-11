package com.Collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortMapByValue {

	public static void main(String[] args) {
		 Map<String, Integer> map = new HashMap<String, Integer>();
	        map.put("john", 20);
	        map.put("Tony", 45);
	        map.put("Mia", 2);
	        map.put("Ron", 67);
	        map.put("MAC", 26);
	        map.put("Sam", 93);
	        Set<Entry<String, Integer>> set = map.entrySet();
	        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
	        Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()
	        {
	            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
	            {
	                return (o1.getValue()).compareTo( o2.getValue() );
	            }
	        } );
	        for(Map.Entry<String, Integer> entry:list){
	            System.out.println(entry.getKey()+" == "+entry.getValue());
	        }
	    }
	

	}


