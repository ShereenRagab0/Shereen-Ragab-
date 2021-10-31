
package javaapplicationass1;

public class Student extends Person
{
    private static String status;
  
    public Student(String name,String address,String phonenumber,String email,String status)
    {
        super(name,address,phonenumber,email);
        this.status = status;
      
    }
  
    public String toString()
    {
      
        return "\n my Name : "+getName()+ " my Address : "+getAddress() +" my Phone Number : "+getPhoneNumber()+" my Email : "+ getEmail()+"my Status :"+status;
    }

}
