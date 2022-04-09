import java.util.Scanner;
class Divisible
  {
    public static void main(String args[])
    {
      
      Scanner s=new Scanner(System.in);
     
      System.out.println("enter the number");
      int n=s.nextInt();
      
    
        if((n%5==0) && (n%11==0))
           {
       System.out.println(" the number divisible by 5 and 11 is " +n); 
       
          }
      else{
       System.out.println(" the entered number is not divisible by 5 and 11 is "); 
        }
           }
       }
  