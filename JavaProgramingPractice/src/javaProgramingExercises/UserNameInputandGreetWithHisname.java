package javaProgramingExercises;

import java.util.Scanner;

public class UserNameInputandGreetWithHisname {
	public static void main(String[] args) {

		Scanner user_input = new Scanner(System.in);

		String first_name;
		System.out.print("Enter your first name");
		first_name = user_input.next();
		// System.out.println("Hello " + first_name);

		String last_name;
		System.out.println("Enter your last name");
		last_name = user_input.next();
		System.out.println("Hello " + first_name + " " + last_name);

		// program 3: users only Alice and Bob are greeted with their names

	}
}
