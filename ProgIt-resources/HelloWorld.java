package examples;

/**
 * Week 1 Exercises 1 and 2.1
 * Write a program that prints "Hello World!" to the console,
 * Normally and then using variables
 * 
 * @author Ethan
 *
 */

public class HelloWorld {

	public static void main(String[] args) {
		String greeting = "Hello World!";
		System.out.println(greeting); // Prints: Hello World!
		
		greeting = "How are you?"; // Changing the variable
		System.out.println(greeting); // Prints: Hello World!
		
		String farewell = "Goodbye!";
		System.out.println(farewell); // Prints: Goodbye!

	}

}
