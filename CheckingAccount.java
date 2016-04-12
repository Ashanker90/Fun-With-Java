public class CheckingAccount extends Account
{
   final static double OVERDRAFT_LIMIT = 50.00;
   private int id;
   private double balance;
   private double annualInterestRate;

   public CheckingAccount()
   {
      super();
   }
   
   public CheckingAccount(int id, double balance, double annualInterestRate)
   {
      super(id, balance, annualInterestRate);
   }
   
   public CheckingAccount(int id, double balance)
   {
      super(id, balance);
      this.annualInterestRate = 0.0;
   }
      
   public void checkForOverdraft()
   {
   if((getBalance()) > (OVERDRAFT_LIMIT))
       {
         
         System.out.println("Exceeding Over draft limit");
         this.balance = this.balance - 10;
       }

     else if(((getBalance())< 0) && ((getBalance())>(OVERDRAFT_LIMIT)))
      {
         this.balance = this.balance -20;
         System.out.println("The Account is overdrawn");
      }
      
    }
   @Override
   public double getMonthlyInterest()
   {
      return(getBalance() * (getAnnualInterestRate()/100));
   }
   
 }        