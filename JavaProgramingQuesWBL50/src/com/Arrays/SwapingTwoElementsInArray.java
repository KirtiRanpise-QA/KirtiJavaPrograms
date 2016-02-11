package com.Arrays;

public class SwapingTwoElementsInArray {

	public static void main(String[] args) {
		int [] numbers= {1,2,5,6,4};
		//swapping 4 and 5
		int a = 2;
		//save the value of the first no to swap as temp variable here temp = 5 
		//then bring the 2nd no to swap in place of first no, here 4 will come  at place 5
		//declare 2nd no to swap as temp, so 5 will come at place of 4
		int temp= numbers [a];//numbers[2]
		numbers[2]= numbers[4];//numbers [2] is now 4
		numbers[4]= temp;

	for(int i = 0; i<numbers.length; i++){
		System.out.print(numbers[i] + "  ");
	}
	
	//swapping 5 and 6
	int temp1= numbers[3];
	numbers[3]= numbers[4];
	numbers[4]= temp1;
	
	for(int j= 0; j< numbers.length; j++){
	
		System.out.print(numbers [j] + " ");
		
	}
	
	
	}

}
