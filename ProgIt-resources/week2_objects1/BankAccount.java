package objects; // Remember to change this when importing (or put inside an Eclipse package called 'objects')

/**
 * Solution to Objects, Exercise 2: Bank account
 * 
 * @author Ethan Kelly
 *
 */
public class BankAccount {
	private String name;
	private int accountNumber;
	private double balance;
	private static int nextAccountNumber;
	
	// Constructor - creates a BankAccount object
	public BankAccount(Person user) {
		this.name = user.getName();
		this.balance = 0.0;
		this.accountNumber = nextAccountNumber;
			nextAccountNumber++;
	}

	// Getters to access (private) attributes above
	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public String getFormattedAccountNumber() { // Gets number padded with zeros to 8 digits
		String str = String.valueOf(accountNumber);
		String accNo = "00000000".substring(str.length()) + str;
		
		return accNo;
	}
	
	/**
	 * Withdraws a given amount from a BankAccount balance.
	 * You can uncomment print statements to see what is happening
	 * 
	 * @param amount - how much we want to withdraw
	 * @return the updated account balance
	 */
	public double withdraw(double amount) {
		double oldBalance = this.getBalance(); // Current balance
		double newBalance = 0; // Where we'll store the updated balance
		
		if (oldBalance >= amount) {
			newBalance = oldBalance - amount;
			//System.out.println("Withdrew " + amount + ". Balance remaining: " + newBalance);
			this.balance = newBalance; // Set the balance to the updated amount
		} else { // We don't want a negative account balance!
			//System.out.println("Insufficient funds! Withdrawing entire balance ...");
			//System.out.println("Remaining balance: " + newBalance);
			newBalance = 0.0;
			this.balance = newBalance; 
		}
		
		return newBalance;
	}
	
	/**
	 * Deposits a given amount to a BankAccount balance.
	 * You can uncomment print statements to see what is happening.
	 * 
	 * @param amount - how much we want to deposit
	 * @return the updated account balance
	 */
	public double deposit(double amount) {
		double newBalance = this.getBalance() + amount;
		//System.out.println("Depositing " + amount + "...");
		//System.out.println("Balance remaining: " + newBalance);
		
		this.balance = newBalance; // Set the balance to the updated amount
		
		return newBalance;
	}
	
	@Override
	public String toString() {
		String toPrint = "   *****   \n"
				+ "Loading account holder details...\n" 
				+ "Name: " + this.getName()
				+ ", account number: " + this.getFormattedAccountNumber()
				+ ", current balance: " + this.getBalance()+ ".";
		
		return toPrint;
	}
	
	// Transfers balance from one BankAccount to another
	public void transferFunds(double amount, BankAccount accountTo) {
		this.withdraw(amount);
		accountTo.deposit(amount);
	}
	
	

	public static void main(String[] args) {

	}
}
