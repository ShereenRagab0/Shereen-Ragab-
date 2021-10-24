
package javaapplication2;


public class JavaApplication2 {

    public static void main(String[] args)
    {
        Account acc1 = new Account(1122,20000,4.5);
       
         acc1.withdraw(2500);
         acc1.deposit(3000);
         acc1.getBalance();
         acc1.getInterestRate();
  System.out.println(acc1.getMonthlyInterestRate());
        

    }

}
    

