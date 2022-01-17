//Even Odd number

import java.util.Scanner;

public class Even
{
  public static void main(String args[])
  {
    System.out.print("Enter Number: ");
    Scanner e = new Scanner(System.in);
    int num = e.nextInt();
    
    eve_odd(num);

  } 
 static void eve_odd(int num)
{
  if(num%2==0)
     {
      System.out.println("number is even:" + num);
     }
     else 
      {
        System.out.print("Number is odd:" + num);
           
       }
}
}
