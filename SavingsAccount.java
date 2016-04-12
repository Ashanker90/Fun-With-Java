public class SavingsAccount extends Account
{
   private int id;
   private double balance;
   private double annualInterestRate;

   public SavingsAccount()
   {
      super();
   }
   public SavingsAccount(int id, double balance, double annualInterestRate)
   {
      super(id,balance,annualInterestRate);
   }
   
   public SavingsAccount(int id, double balance)
   {
      super(id,balance);
      this.annualInterestRate = 0.0;
   }
   
   @Override
   public void withdraw(double amount)
   {
      if((getBalance() - amount)>=0)
      {
      setBalance((getBalance() - amount));
      System.out.println("The amount withdrawn : "+amount+ "\nBalance: "+ getBalance());
      }
      else
      {
      System.out.println("Insufficient funds.");
      }
    }
 }