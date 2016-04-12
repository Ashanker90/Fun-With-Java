/* Name: Anshul Shanker
   Assignment 4 
   CS 207
*/
class Account_App
{
   public static void main(String args[])
   {
     Account a = new Account(1122,20000.00,4.5);
     a.withdraw(2500);
     a.deposit(3000);
     
     System.out.println(" The balance is : " + a.getBalance() + "\n The monthly interest is : " + a.getMonthlyInterest());
    }
}