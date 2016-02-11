/*Write a program print "ping" if a number is divisible by 3,"pong" if a number is divisible by 5,
 and "ping pong" if number is divisible by both, else print the number.
 */


package com.Loops;

import java.util.Scanner;

public class NumberDivisibleBy3And5 {
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		 
		System.out.println("Enter your no");
		int a= scan.nextInt();
		//int a = 19;
		if((a%3==0&& a%5==0)){
			System.out.println("pingpong");
		}
		else if(a%5==0){
			System.out.println("Pong");
		}
			else if(a%3==0){
				System.out.println("Ping");
			}
			else{
				System.out.println(a);
			}
		}
	}


