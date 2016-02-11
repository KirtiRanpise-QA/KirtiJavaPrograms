package com.Strings;


//Write a program to find a substring in a given string and then replace it with another 
//string.
public class FindSubstrAndReplace {

	public static void main(String[] args) {
		String inputStr = " The baby is crying.";
		String SubStr= "crying";
		String replStr= "smiling";
		
		System.out.println(replaceString(inputStr, SubStr,replStr));
		
				}
public static String replaceString(String inputStr, String SubStr,String replStr){
	if(inputStr.contains(SubStr)){
		
		return inputStr.replaceAll( SubStr, replStr );
	}
	else{
		
		return inputStr;
	}
}
}
