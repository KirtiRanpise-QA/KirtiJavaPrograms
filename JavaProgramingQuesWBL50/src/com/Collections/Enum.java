package com.Collections;

//Write a program that defines an enum having months of the year and then prints the value of all the enum elements.
/*A Java Enum is a special Java type used to define collections of constants. More precisely, a Java enum type is a special kind 
 * of Java class. An enum can contain constants, methods etc. Java enums were added in Java 5.
 */
public class Enum {

	public static void main(String[] args) {
		// printing all the elements in month use loop
		int count = 1;
		for (Month m : Month.values()) {

			// system.out.println(m);
			// 0236+++

			// Output using string formatting.
			System.out.printf("Month%d = %s\n", count++, m);
		}

	}

	// declaring simple enum month having all months in a year
	public enum Month {

		January, February, March, April, June, July, August, September, October, November, December;

	}

}
