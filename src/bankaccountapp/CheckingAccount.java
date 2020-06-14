package bankaccountapp;

public class CheckingAccount extends Account {
	// List properties specific to checking account
	private int debitCardNumber;
	private int debitCardPIN;
	
	// Constructor to initialize checking account properties
	public CheckingAccount(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "1" + accountNumber;
//		System.out.println("Account Number: " + accountNumber);
//		System.out.println("New Checking Account");
		setDebitCard();
	}
	
	@Override
	public void setRate() {
//		System.out.println("Checking Account Interest Rate");
		rate = getInterestRate() * 0.15;
	}
	
	private void setDebitCard() {
		debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
//		System.out.println(debitCardNumber);
		debitCardPIN = (int) (Math.random() * Math.pow(10, 4));
//		System.out.println(debitCardPIN);
	}
	
	// List methods specific to checking account
	@Override
	public void displayInfo() {
//		System.out.println("Account Type: Checking Account");
		super.displayInfo();
		System.out.println("Your Checking Account Information:" + 
				"\nDebit Card Number: " + debitCardNumber + 
				"\nDebit Card PIN: " + debitCardPIN);
	}
}
