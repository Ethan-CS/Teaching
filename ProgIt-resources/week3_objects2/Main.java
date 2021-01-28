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
	private static String randomName() {
		// Just some pun names I found online
		String[] names = {"Patty O'Doors",
				"Maureen Biologist",
				"Teri Dactyl",
				"Liz Erd",
				"Lois Di Nominator",
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
	private static int randomAge(int max) {
		return (random.nextInt(max) + 18); // We don't want someone under 18 opening an account
	}

	/**
	 * Gives a random eye colour from a given array.
	 * You can ignore this method!
	 * 
	 * @return a random eye colour
	 */
	private static String randomEyeColour() {
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

	/**
	 * Gives a random GPA (maximum 20.0)
	 * You can ignore this method!
	 * 
	 * @return a random GPA
	 */
	private static double randomGPA() {
		return (random.nextDouble()*20);
	}

	/**
	 * Gives a random salary from 50,000 to 100,000 (optimistic...).
	 * You can ignore this method!
	 * 
	 * @return
	 */
	private static double randomSalary() {

		return ((random.nextDouble() + 1)*50000);
	}


	public static void main(String[] args) {

		// Define new Person objects using random selection methods
		Person p = new Person(randomName(),randomAge(82),randomEyeColour());
		Person q = new Person(randomName(),randomAge(82),randomEyeColour());

		System.out.println(p.toString()); // Could just call p rather than p.toString()
		System.out.println(q.toString());

		System.out.println();


		// Give our people bank accounts (2.7)
		BankAccount pAccount1 = new BankAccount(p);
		BankAccount pAccount2 = new BankAccount(p); // 2.9 (p's second bank account)
		BankAccount qAccount = new BankAccount(q);

		// Print bank account numbers
		System.out.println(p.getName() + "'s Account Number: " 
				+ pAccount1.getFormattedAccountNumber()  // Gets number padded with zeros to 8 digits
				+ "\n" // New line
				+ q.getName() 
				+ "'s Account Number: " 
				+ qAccount.getFormattedAccountNumber());

		System.out.println();


		// Deposit and withdrawal testing
		pAccount1.deposit(100); // p deposits 100
		pAccount1.withdraw(150); // p tries to withdraw 150, can only get 100

		// Transfer funds testing (from 2 to 1)
		qAccount.deposit(100); // q deposits 100
		qAccount.transferFunds(25, pAccount1); // q transfers 25 to p's account

		System.out.println(pAccount1.toString() + "\n"
				+ pAccount2.toString() + "\n "
				+ qAccount.toString());
		System.out.println();


		// Section 3 (Inheritance)
		Student s = new Student(randomName(),randomAge(30),randomEyeColour(),randomGPA());
		BankAccount sAccount = new BankAccount(s);
		System.out.println(s.toString());
		System.out.println(sAccount.toString());

		Lecturer l = new Lecturer(randomName(),randomAge(82),randomEyeColour(),randomSalary());
		System.out.println(l);
		BankAccount lAccount = new BankAccount(l);
		SavingsAccount lSavings = new SavingsAccount(l, 0.05);
		lSavings.deposit(l.getSalary()/120); // Deposits a tenth of monthly salary
		lSavings.addInterest(); // Calculate and add interest
		System.out.println(lAccount); // Regular account
		System.out.println(lSavings); // Savings account
	}
}
