package com.OopsConcepts;

public class MethodOverloadingDiffSequenceOfArgs {

	public static void main(String[] args) {
		MethodOverloadingDiffSequenceOfArgs obj = new MethodOverloadingDiffSequenceOfArgs();
		obj.getAns( 12, 'k', "Kirti");
		obj.getAns( "Priya", 9, 'a');

	}
public void getAns(int num, char c, String s){
	System.out.println(" This is the first definition of method getAns");
}
public void getAns(String s, int num, char c){
	System.out.println(" This is the second defintion of methos getAns");
}
}
