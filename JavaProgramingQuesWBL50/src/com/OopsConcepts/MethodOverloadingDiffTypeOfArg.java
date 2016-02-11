package com.OopsConcepts;

public class MethodOverloadingDiffTypeOfArg {

	public static void main(String[] args) {
		MethodOverloadingDiffTypeOfArg obj= new MethodOverloadingDiffTypeOfArg();
		obj.showResult( 12);
		obj.showResult( "kirti");
		
		
}

	public void showResult(int num){
		System.out.println(num);
	}
	
	public void showResult(String s){
		System.out.println(s);
	}
}
