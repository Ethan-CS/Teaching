package objects;

public class SavingsAccount extends BankAccount {
	private double interestRate;
	
	public SavingsAccount(Person customer, double interestRate) {
		super(customer);
		this.interestRate = interestRate;
	}
	
	
	@Override
	public void withdraw(double amount) {
		if(amount > super.getBalance()) { 
			System.out.println("Cannot withdraw!");
		}else {
			super.withdraw(amount); // avoids code duplication
		}
	}
	
	public void addInterest() {
		double currentBalance = getBalance();
		double extra =  currentBalance * (interestRate/100.0);
		deposit(extra);
	}
	
	public String toString() {
		return super.toString() + " (savings)";
	}
}
