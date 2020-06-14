package bankaccountapp;

public interface InterestRate {
	// Write a method that returns the interest rate
	default double getInterestRate() {
		return 2.5;
	}
}
