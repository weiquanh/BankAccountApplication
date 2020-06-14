package bankaccountapp;

public class SavingsAccount extends Account {
	// List properties specific to saving account
	private int safetyDepositBoxID;
	private int safetyDepositBoxCode;
	
	// Constructor to initialize saving account properties
	public SavingsAccount(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "2" + accountNumber;
//		System.out.println("Account Number: " + accountNumber);
//		System.out.println("New Saving Account");
		setSafetyDepositBox();
	}
	
	@Override
	public void setRate() {
//		System.out.println("Saving Account Interest Rate");
		rate = getInterestRate() - 0.25;
	}
	
	private void setSafetyDepositBox() {
		safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
//		System.out.println(safetyDepositBoxID);
		safetyDepositBoxCode = (int) (Math.random() * Math.pow(10, 4));
//		System.out.println(safetyDepositBoxID);
	}
		
	// List methods specific to saving account
	@Override
	public void displayInfo() {
//		System.out.println("Account Type: Saving Account");
		super.displayInfo();
		System.out.println("Your Saving Account Information:" + 
				"\nSafety Deposit Box ID: " + safetyDepositBoxID + 
				"\nSafety Deposit Box Code: " + safetyDepositBoxCode);
	}
}
