import java.util.Scanner;

/**
 * Program to take keyboard input for user name and age, analyses to separate the String name from integer age
 * 
 * @author Ethan Kelly
 *
 */

public class NameAndAge {
	
	public static void getNameAndAge() {
		
		Scanner keyboard = new Scanner(System.in); // New Scanner object that gets information from the user via console input
		
		System.out.println("Please enter your name and age");
		
		int userAge = 0; // Age of the user
		String userFirstName = keyboard.next(); // First name of user (we will at least have this, may not have a surname)
		String userName = userFirstName;
		
		
		for (int i = 0; i < 4; i++) { // Loop for a while - enough to catch a few names
			if (keyboard.hasNextInt()) { // If the next thing the user typed is an integer, store that as their age
				userAge = keyboard.nextInt();
				break;
			} else {
				userName = userName + " " + keyboard.next(); // Add this to the full name
			}
		}

		System.out.println("You are " + userName  + " and you are " + userAge + " years old");

		keyboard.close();
	}
	
	public static void main(String[] args) {
		getNameAndAge();
	}

}
