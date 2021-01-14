package examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	
	/**
	 * When called, provides a random number between 0 and N
	 * 
	 * @param int n
	 * @return A random integer between 0 and 99
	 */
	public static int computerRandomNumber(int n) {
		
		Random rand = new Random();
		int number = rand.nextInt(n); // Gets a random number between 0 and 99
		
		return number;
	}
	
	public static void guesses(int n) {
		String guessesLeft = "guesses remaining";
		
		boolean guessed = false;
		List<Integer> pastGuesses = new ArrayList<>(); // Used to store guesses made, to help player not guess the same value twice

		Scanner keyboard = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			if (i == 9) {
				guessesLeft = "guess remaining - make it count...";
			}
			System.out.println("You have " + (10-i) + " " + guessesLeft); // Number of guesses remaining
			System.out.println("Make a guess!");
			int guess = keyboard.nextInt();
			if (guess == n) {
				System.out.println("You guessed the number I was thinking of!"); // They got it!
				guessed = true;
				break;
			} else {
				System.out.println("Sorry, that's not the number I'm thinking of."); // Not the right number
				pastGuesses.add(guess);
				System.out.println("Your guesses: " + pastGuesses.toString());
			}
		}
		 
		if (guessed) {
			System.out.println("Well done!");	
		} else {
			System.out.println("You're out of guesses - better luck next time!");
		}

		
		keyboard.close();
		
	}
	
	
	public static void main(String[] args) {
		int maxRandomNum = 99;
		
		int number = computerRandomNumber(maxRandomNum);
		System.out.println("I'm thinking of a number...");
		
		guesses(number);
	}

}
