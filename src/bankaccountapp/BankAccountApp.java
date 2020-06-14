package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		CheckingAccount ca1 = new CheckingAccount("Weiquan Huang", "123456789", 1500);
		SavingAccount sa1 = new SavingsAccount("Tom Jerry", "234567890", 2500);
		
//		sa1.compound();

		ca1.displayInfo();
		System.out.println("-------------------");
		sa1.displayInfo();
		
//		sa1.deposit(5000);
//		sa1.withdraw(200);
//		sa1.transfer("Weiquan Huang", 3000);
		*/
		
		List<Account> accounts = new LinkedList<>();
		// Read csv file and create new accounts based on the data
		String file = "E:\\original.csv";
		List<String[]> newAccountHolder = utility.CSV.read(file);
		for (String[] accountHolder : newAccountHolder) {
			String name = accountHolder[0];
			String sSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
//			System.out.println(name + " " + sSN + " " + accountType + " $" + initDeposit);
			if (accountType.equals("Savings")) {
//				System.out.println("OPEN A SAVINGS ACCOUNT");
				accounts.add(new SavingsAccount(name, sSN, initDeposit));
			} else if (accountType.equals("Checking")) {
//				System.out.println("OPEN A CHECKING ACCOUNT");
				accounts.add(new CheckingAccount(name, sSN, initDeposit));
			} else {
				System.out.println("ERROR READING ACCOUNT TYPE");
			}
		}
		
		for (Account acc : accounts) {
			System.out.println("\n***********NEW ACCOUNT***********");
			acc.displayInfo();
		}
		
		// pick random account to do following transaction
//		accounts.get((int) Math.random() * accounts.size()).deposit(1000);
//		accounts.get((int) Math.random() * accounts.size()).withdraw(1000);
//		accounts.get((int) Math.random() * accounts.size()).transfer("Weiquan Huang", 1000);
//		accounts.get((int) Math.random() * accounts.size()).printBalance();
	}

}
