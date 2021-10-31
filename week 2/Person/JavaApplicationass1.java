
package javaapplicationass1;


public class JavaApplicationass1 {

    public static void main(String[] args)
    {
        Student s = new Student("shereen","25-banimazer _ Minya","0104455","shereenragab@gmail.com","sophomore");
      System.out.println(s.toString());
      
       MyDate d = new MyDate(20,3,2002);
      
       Employee e = new Employee("lamia","banimazer","000007","lolo@gemail.com","55 street+",7767,d);
      
       System.out.println(e.toString());

    }
    
}
