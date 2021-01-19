package objects; // Remember to change this when importing (or put inside an Eclipse package called 'objects')

import java.util.Random;

public class Main {
	public static Random random = new Random();
	
	/**
	 * Selects a random name from an array of names.
	 * You can ignore this method!
	 * 
	 * @return a random name
	 */
	public static String randomName() {
		// Just some pun names I found online
		String[] names = {"Patty O'Doors",
				"Maureen Biologist",
				"Teri Dactyl",
				"Liz Erd",
				"Lois Di Noninator",
				"Ray O'Sun",
				"Chris Anthemum",
				"Anne Teak",
				"Bess Twishes",
				"Polly Ester",
				"Fran G Pani",
				"Perry Scope",
				"Norma Leigh Absent"};
		
		// Return a random element of the above array
		return names[random.nextInt(names.length)];
	}
	
	/**
	 * Gives a random age.
	 * You can ignore this method!
	 * 
	 * @return a random age between 18 and 100
	 */
	public static int randomAge() {
		return (random.nextInt(82) + 18); // We don't want someone under 18 opening an account
	}

	/**
	 * Gives a random eye colour from a given array.
	 * You can ignore this method!
	 * 
	 * @return a random eye colour
	 */
	public static String randomEyeColour() {
		String[] colours = {"amber",
				"blue",
				"green",
				"brown",
				"grey",
				"hazel",
				"red",
				"violet"};
		
		return colours[random.nextInt(colours.length)];
	}
	
	public static void main(String[] args) {

		// Get two random names for bank accounts
		String name1 = randomName();
		String name2 = randomName();
		
		// Get two random ages
		int randomAge1 = randomAge();
		int randomAge2 = randomAge();
		
		// Random eye colour selection
		String colour1 = randomEyeColour();
		String colour2 = randomEyeColour();
		
		// Define new Person objects
		Person p = new Person(name1,randomAge1,colour1);
		Person q = new Person(name2,randomAge2,colour2);
		
		System.out.println(p);
		System.out.println(q);
		
		System.out.println();
		
		// Give our people bank accounts
		BankAccount pAccount = new BankAccount(p);
		BankAccount qAccount = new BankAccount(q);
		
		System.out.println(p.getName() + "'s Account Number: " + pAccount.getFormattedAccountNumber()); // Gets number padded with zeros to 8 digits
		System.out.println(q.getName() + "'s Account Number: " + qAccount.getFormattedAccountNumber());

		System.out.println();
		
		// Deposit and withdrawal testing
		pAccount.deposit(100); // p deposits 100
		pAccount.withdraw(150); // p tries to withdraw 150, can only get 100
		
		// Transfer funds testing (from 2 to 1)
		qAccount.deposit(100); // q deposits 100
		qAccount.transferFunds(25, pAccount); // q transfers 25 to p's account
		
		System.out.println(pAccount.toString());
		System.out.println(qAccount.toString());
	}
}
