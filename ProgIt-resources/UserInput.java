package examples;

/**
 * Week 1 Exercise 5.1-4
 * Create a program that gets a user's name, age and colour.
 * Use Scanner to sort this information and return it to a console output.
 * 
 * @author Ethan Kelly
 *
 */

import java.util.Scanner;

public class UserInput {

	public static void getUserInput() {

		// New Scanner object that gets information from the user via console input
		Scanner keyboard = new Scanner(System.in); 
		System.out.println("Please enter your name and age");

		// Age of the user
		int userAge = 0;
		// First name of user (we will at least have this, may not have a surname)
		String userFirstName = keyboard.next(); 
		// For now, let's start the whole user name with just the first name
		String userName = userFirstName;

		
		for (int i = 0; i < 4; i++) { // Loop for a while - enough to catch a few names
			if (keyboard.hasNextInt()) { // If the next thing the user typed is an integer, store that as their age
				userAge = keyboard.nextInt();
				break;
			} else {
				userName = userName + " " + keyboard.next(); // Add this to the full name
			}
		}

		System.out.println("You are " + userName + " and you are " + userAge + " years old");
		
		// Get user's favourite colour
		System.out.println("So, what's your favourite colour?");
		String colour = keyboard.next();
		System.out.println("No way, " + colour.toLowerCase() + " is my favourite colour too!");
		
		System.out.println("Nice talking to you, " + userFirstName + "!");
		keyboard.close();
	}


	public static void main(String[] args) {
		getUserInput();
	}

}
