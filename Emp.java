//Employee Java

import java.util.Scanner;

class Employee
{ 
   int empid;
   String empName;
   char gender;

 
  Employee()
  {
    
    empid  = 2;
    empName = "Dhiraj";
    gender = 'M';
  }    

  void Display()
   {
     System.out.println("empid" + ":" + empid + "\n"+"empName" + ":" + empName +"\n"+ "gender"  + ":" + gender);
   }
  
  


}

public class Emp
{
      public static void main(String []args) 
      { 
        Employee e= new Employee();
        e.Display();

          
              
      }
}
