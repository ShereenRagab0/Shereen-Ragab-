
package javaapplicationass1;
class MyDate
{
    private int year;
    private int month;
    private int day;
  
    public MyDate(int day,int month,int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }
   public String toString()
   {
       return " "+day+"/"+month+"/"+year;
   }
}

class Employee extends Person
{
    private String office;
    private double salary;
    private MyDate dateHired;
  
    public Employee(String name,String address,String phoneNumber,String email,String office,double salary,MyDate dateHired)
    {
        super(name,address,phoneNumber,email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }
  
    
    public String toString()
    {
        return "\nName : "+getName()+ " Address : "+getAddress() +" Phone Number : "+getPhoneNumber()+" Email : "+ getEmail()+" Office : "+office +" Salary : "+salary + " Hiredate : "+dateHired;
    }
  
}

