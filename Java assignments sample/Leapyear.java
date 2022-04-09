import java.util.Scanner;
class Leapyear
  {
    public static void main(String args[])
    {
      
      Scanner s=new Scanner(System.in);
     
      System.out.println("enter a year");
      int year=s.nextInt();
      
       if (((year % 4 == 0) && (year % 100!= 0)) || 
           (year%400 == 0))
       {
         System.out.println("entered year is a leap year");
         }
      else
       {
        System.out.println("entered year is not a leapyear");
         }
    }
    
 }