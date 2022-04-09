
//6 WAP to accept number and check it is +ve or -ve 
import java.util.Scanner;
public class Positive
  {
    public static void main(String args[])
    {
      int num;
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the number"); 
      num=s.nextInt();

      if(num>0)
      {
        System.out.println("Entered number is positive");
        
      }
      else if( num < 0 && num == 0)
      {
        System.out.println("the entered number is negative");
      }
      else{
        System.out.println("the Entered number is Zero");
      }
      
    }
      }
  