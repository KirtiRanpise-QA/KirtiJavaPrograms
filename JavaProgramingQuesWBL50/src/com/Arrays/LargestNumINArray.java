package com.Arrays;

public class LargestNumINArray {

	public static void main(String[] args) {
		int [] a= {28, 19, 217, 190, 45, 98,1000};
		int max = a[0];
		for(int i= 0; i<= a.length-1; i++)
			
		{
			
			if(max <=a[i])
			{
				max= a[i];
			}
		}
System.out.println("Largest number in given array is " + max);
	

}
}
