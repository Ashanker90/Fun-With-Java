/**A test program:
Create an Account object with an account ID of 1122, a balance of $20,000, and an annual interest rate of 4.5%.
Use the withdraw method to withdraw $2,500.
Use the deposit method to deposit $3,000.
Print the balance, the monthly interest, and the date when this account was created.
*/
public class AccountTest
{
 public static void main(String [] args)
 {

 Account a = new Account(1122, 20000.00);
 a.setAnnualInterestRate(4.5);

 System.out.println("\nCurrent account values: \n" + a);

 a.withdraw(2500.00);
 System.out.println("\nCurrent account values: \n" + a);
 a.deposit(3000.00);
 System.out.println("\nCurrent account values: \n" + a);

 System.out.println("/****************SAVINGS ACCOUNT********************/");
 SavingsAccount sa = new SavingsAccount(1122, 20000.00);
 sa.setAnnualInterestRate(4.5);

 sa.withdraw(2500.00);
 System.out.println("\nCurrent account values: \n" + sa);
 sa.deposit(3000.00);
 System.out.println("\nCurrent account values: \n" + sa);

 System.out.println("/************CHECKING ACCOUNT*******************/");
 CheckingAccount ca = new CheckingAccount(1122, 20000.00);
 ca.setAnnualInterestRate(4.5);

 ca.withdraw(2500.00);
 System.out.println("\nCurrent account values: \n" + ca);
 ca.deposit(3000.00);
 System.out.println("\nCurrent account values: \n" + ca);


 }
}