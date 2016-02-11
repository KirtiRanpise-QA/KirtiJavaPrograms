package com.Strings;

public class ReverseWordsInString {

	public static void main(String[] args) {
		String s= "This is lovely";
		String [] str= s.split(" ");
		StringBuffer obj= new StringBuffer();
		for(int i= str.length-1;i>=0;i--){
		obj.append(str[i]);
		obj.append(" ");
		}
System.out.println("reversed string is: " + obj.toString());
	}

}
