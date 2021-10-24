
package javaapplication2;

import javax.xml.crypto.Data;

public class Account
{
     private double id;
    private double balance; 
    private double annuaInterestRate; 
   private Data  dataCreated ;
    public Account()
    {
          id =0 ;
        balance = 0;
        annuaInterestRate = 0;
    }

    public Account( double id ,double amount ,double rate )
    {
       this.id = id;
        balance = amount;
        annuaInterestRate = rate  ;

    }
 public void setid(int newid)
    {
     id=new id ;
     }
    public void withdraw(double amount)
    {
        balance = balance - amount;
    }
    public void deposit(double amount)
    {
        balance = balance + amount;
    }

     public void setInterest(double rate)
    {
        balance = balance + balance * rate;
   
    }
      public void getMonthlyInterestRate( )
    {
       
  annuaInterestRate= annuaInterestRate / 12;
    }
         public double getid()
    {
        return id;
    }
    public double getInterestRate()
    {
        return annuaInterestRate;
    }

    public double getBalance()
    {
        return balance;
    }

    public void close()
    {
        balance =0;
    }
    
}
