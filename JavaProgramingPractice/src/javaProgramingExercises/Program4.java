/*write a program that asks user for no n and then print sum of the nos from 1 to n
 * 
 */

package javaProgramingExercises;

import java.util.Scanner;

public class Program4 {
	// int n;
	public static void main(String[] args) {
		Scanner numb = new Scanner(System.in);

		System.out.println("Enter your number");
		int n = numb.nextInt();
		System.out.println(" your number is " + n);
		int sum = 0;

		for (int i = 1; i <= n; i++) {

			sum = sum + i;
		}

		System.out.println("Sum  = " + sum);
	}

	/*
	 * int n,i=1,sum=0; Scanner input=new Scanner(System.in);
	 * System.out.print("Enter Number :"); n=input.nextInt(); do { sum=sum+i; i
	 * +=1; } while(i<=n); System.out.print("Sum of First " + n +
	 * " Numbers = "+sum);
	 */
}
