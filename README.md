# BankAccountApplication

Scenario: You are a back-end developer and need to create an application to handle new customer bank account requests.

The application should do the following:
•	Read a .csv file of names, social security numbers, account type, and initial deposit
•	Use a proper data structure to hold all these accounts
•	Both savings and checking accounts share the following properties:
  o	deposit()
  o	withdraw()
  o	transfer()
  o	displayInfo()
•	Generate a 11-digit account number base on the customer information and account type
•	Savings account holders are given a safety deposit box, identified by a 3-digit number, and accessed with a 4-digit code
•	Checking accounts holder are assigned a Debit Card with a 12-digit number and 4-digit PIN
•	Both accounts will use an interface that determines the base interest rate:
  o	Savings accounts will use 0.25 points less than the base rate
  o	Checking accounts will use 15% of the base rate
•	The displayInfo method should reveal account information as well as information specific to the Checking account or Savings account.
