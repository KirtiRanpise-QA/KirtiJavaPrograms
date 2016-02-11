package com.Strings;

public class ThisIsNiceProg1 {

	public static void main(String[] args) {
	String  s= "It is very very beautiful";
String [] arr= s.split(" ");
for(int i= 0;i<arr.length; i++){
	

System.out.print (arr[i]+ (i+1));

if(i<arr.length-1){
System.out.print(" ");

	}

}
}
}