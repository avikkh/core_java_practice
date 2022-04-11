import java.util.Scanner;

class IntegerTOstring
{   
    public static void main(String args[]) 
    {   
      Scanner s= new Scanner(System.in);
      System.out.println("Enter the numbers");
      int number=s.nextInt();
      //type casting integer to string
      String str=String.valueOf(number);
      //interger will operates as plus addition
      System.out.println(number+100);
      //string takes cancatening
      System.out.println(str+100);
      }
}