
package javaapplicationass1;

public class Person 
{
      private String name;
      private String phonenumber;
      private String email;
      private String address;
  
  
    public Person(String name,String phonenumber,String email,String address)
    {
        this.name = name;
          this.phonenumber = phonenumber;
        this.email = email;
        this.address = address;
      
    }
   
    public String getName()
    {
        return name;
    }
      public String getPhoneNumber()
    {
        return phonenumber;
    }
    public String getEmail()
    {
        return email;
    }
    public String getAddress()
    {
        return address;
    }
  
  
}

