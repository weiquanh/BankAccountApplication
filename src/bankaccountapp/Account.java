package bankaccountapp;

public abstract class Account implements InterestRate {
	// List common properties for accounts
	private String name;
	private String sSN;
	private double balance;
	private static int index = 11111;	
	protected String accountNumber;
	protected double rate;
	
	// Constructor to set basic properties and initialize the account
	public Account(String name, String sSN, double initDeposit) {
		this.name = name;
		this.sSN = sSN;
		balance = initDeposit;
//		System.out.println("Name: " + name + " SSN: " + sSN + " Balance: " + balance);
		
		// Set account number
		index++;
		this.accountNumber = setAccountNumber();
//		System.out.println("Account Number: " + accountNumber);
//		System.out.println(getInterestRate());
		
		setRate();
	}
	
	public abstract void setRate();
	
	private String setAccountNumber() {
		String last2SSN = sSN.substring(sSN.length() - 2, sSN.length());
		int uniqueNumber = index;
		int randomNumber = (int) (Math.random() * Math.pow(10, 3));
		if (randomNumber < 10) {
			return last2SSN + uniqueNumber + randomNumber + "00";
		} else if (randomNumber < 100 && randomNumber > 9) {
			return last2SSN + uniqueNumber + randomNumber + "0";
		} else {
			return last2SSN + uniqueNumber + randomNumber;
		}
	}
	
	public void compound() {
		double accruedInterest = balance * (rate / 100);
		balance += accruedInterest;
		System.out.println("Accrued Interest: $" + accruedInterest);
		printBalance();
	}
	
	// List common methods
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Depositing $" + amount);
		printBalance();
	}
	
	public void withdraw(double amount) {
		balance -= amount;
		System.out.println("Withdrawing $" + amount);
		printBalance();
	}
	
	public void transfer(String destination, double amount) {
		balance -= amount;
		System.out.println("Transferring $" + amount + " to " + destination);
		printBalance();
	}
	
	public void printBalance() {
		System.out.println("Your current balance is $" + balance);
	}
	
	public void displayInfo() {
		System.out.println("Name: " + name + 
				"\nAccount Number: " + accountNumber + 
				"\nBalance: " + balance +
				"\nInterest Rate: " + rate + "%");
	}
}
