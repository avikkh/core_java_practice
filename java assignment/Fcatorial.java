import java.util.Scanner;
class Factorial
  {
    public static void main(String args[])
    {
      int f=1;
      Scanner s=new Scanner(System.in);
      System.out.println("enter the number");
      int n=s.nextInt();
      
      while(n>=1)
      {
        f=f*n;
     // System.out.println(+f);
        n--;
      }
      System.out.println("the factorial of a number" +f);
      
      
    }
  }