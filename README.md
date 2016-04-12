A class named Account that contains the following:

Data Members
A private data filed of type int named id for the account;
A private data field of type double named balance for the account;
A private data field of type double named annualInterestRate that stores the current interest rate.

Methods
A no-arg constructor that creates a default account and sets the following data members to 0 (zero):
id, balance, and annualInterestRate;
A constructor that creates an account with the specified id, initial balance and interest rate;
The accessor and mutator methods for id, balance and annualInterestRate;
A method named getMonthlyInterestRate( ) that returns the monthly interest rate (the percentage);
A method named getMonthlyInterest( ) that returns the monthly interest (the calculated interest earned by the account);
A method named withdraw that withdraws a specified amount from the account;
A method named deposit that deposits a specified amount into the account.
Override the toString( ) method to display the values in the account (id, balance, interest rate);
An appropriate equals method using the getClass( ) method to compare like objects.


The UML diagram for the class and then implement the class.


A test program that creates an Account object with an account ID of 1122, a balance of $20,000, and an annual interest rate of
4.5%. Use the withdraw method to withdraw $2,500, use the deposit method to deposit $3,000, and print the balance and the monthly
interest.
Note: The method getMonthlyInterest( ) is to return monthly interest, not the interest rate. Monthly interest is balance *
monthlyInterestRate. monthlyInterestRate is annualInterestRate / 12. Note that annualInterestRate is a percentage, e.g. like
4.5%. This must be divided by 100.

Notes
Two new classes “CheckingAccount” and “SavingsAccount”.
These classes are subclasses of the “Account” class.
The descriptions for each class are provided on the following pages.

Checking Account
CheckingAccount is a subclass of class Account.
CheckingAccount has the following two additions to the base class Account:

1) CheckingAccount is to include an overdraft limit of 50 dollars.
If the account balance is a negative value less than zero, but greater than the overdraft limit, the account is charged a
$10 dollar fee, and the account will remain a negative value, and will still be accessible. A message is to be
displayed to indicate that the account is overdrawn.
If the account balance exceeds the overdraft limit, the account is charged a $20 fee, and a message is displayed to
indicate that the account is locked until a deposit is made to bring the account up to a positive value.


Note: since the overdraft value is common to all instances of CheckingAccount, and it is to be the same value for all
instances, you may wish to declare it as final static, for example final static double
OVERDRAFT_LIMIT = 50.00;

2) Rather than interest being compounded monthly, interest for CheckingAccount will be calculated as simple interest (like
Account), but annually (rather than monthly). Therefore, the calculation for interest is to be the following:
(current balance) multiplied by (annual interest rate divided by 100)
 (note: there will be no division by 12, as in class Account).


Savings Account
SavingsAccount is a subclass of class Account.
SavingsAccount is to have the characteristics of Account with the following addition:
SavingsAccount cannot be overdrawn. In the event an attempt is made to withdraw funds greater than the balance amount, a message
will be displayed listing the current balance as well as a message that the withdrawal cannot be made due to insufficient funds.
Savings Account should require just one Account method to be overridden:
@Override
 public void withdraw(double amount)

