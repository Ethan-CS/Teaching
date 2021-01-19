package examples;

/**
 * Week 1 Exercise 6.3-4
 * Write a program that returns the prime numbers from 1 to N,
 * Where N is obtained through user input.
 * 
 * @author Ethan Kelly
 *
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeChecker {

	/**
	 * Takes a parameter p (integer), determines whether it is prime or not.
	 * 
	 * @param int p
	 * @return true if p is prime, false if not
	 */
	public static boolean primeCheck(int p) {
		boolean isPrime = true;
		
		for (int i = 2; i < p / 2; i++) {
			if (p % i == 0) {
				isPrime=false;
				break;
			}
		}
			
		return isPrime;
	}
	
	/**
	 * Gives all the prime numbers up to the given input.
	 * 
	 * @param int max
	 * @return List of primes up to max
	 */
	public static List<Integer> getPrimes(int max) {
		List<Integer> primes = new ArrayList<>();
		
		for (int i = 2; i < max; i++) {
			if (primeCheck(i)) {
				primes.add(i);
			}
		}
		
		return primes;
	}
	
	/**
	 * Asks for a user integer input, returns that input.
	 * 
	 * @return number given by the user
	 */
	public static int getNumber() {
		int userNumber = 0;
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter an integer to calculate prime numbers to...");
		
		while (userInput.hasNext()) {
			if (userInput.hasNextInt()) {
				userNumber = userInput.nextInt();
				break;
			} else {
				System.out.println("Not an integer, please try again!");
				userInput.next();
			}
		}
		
		
		userInput.close();
		
		return userNumber;
	}
	
	public static void main(String[] args) {
		
		int max = getNumber();
		
		List<Integer> primes = getPrimes(max);
		System.out.println(primes.toString());
	}

}
