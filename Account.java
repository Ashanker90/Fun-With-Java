/* Name: Anshul Shanker
   Assignment 4 
   CS 207
*/
class Account
{
   private int id;
   private double balance;
   private double annualInterestRate;
   //Constructors
   public Account()
   {
      this.id = 0;
      this.balance = 0.0;
      this.annualInterestRate = 0.0;
   }
   
   public Account(int id, double balance, double annualInterestRate)
   {
      this.id = id;
      this.balance = balance;
      this.annualInterestRate = annualInterestRate;
   }
   
   public Account(int id, double balance)
   {
      this.id = id;
      this.balance = balance;
      this.annualInterestRate = 0.0;
   }
   //Setters
   public void setId(int id)
   {
      this.id = id;
   }
   public void setBalance(double balance)
   {
      this.balance = balance;
   }
   public void setAnnualInterestRate(double annualInterestRate)
   {
      this.annualInterestRate = annualInterestRate;
   }
   
   //Getters
   public int getId()
   {
      return(this.id);
   }
   public double getBalance()
   {
      return(this.balance);
   }
   public double getAnnualInterestRate()
   {
      return(this.annualInterestRate);
   }
   //Monthly Interest Rate
   public double getMonthlyInterestRate()
   {
      return(this.annualInterestRate/12);
   }
   //Monthly Interest
   public double getMonthlyInterest()
   {
      return(this.balance*this.annualInterestRate/1200);
   }
   //Withdraw method
   public void withdraw(double amount)
   {
      this.balance = this.balance - amount;
   }
   //Deposit Method
   public void deposit(double amount)
   {
      this.balance = this.balance + amount;
   }
   
   @Override
   public String toString()
   {
      return(this.id + "\n" + this.balance + "\n" + this.annualInterestRate);
   }
   
   @Override
	public boolean equals(Object o) 
   {
		if (o == null) 
      {
			return false;	
		} 
      else if (o.getClass() != this.getClass() ) 
      {
			return false;
		} 
      else  
      {
			return ( ((Account)o).getId() == this.id && ((Account)o).getBalance() == this.balance && ((Account)o).getAnnualInterestRate() == this.annualInterestRate );
		}
    }
   
 }
      