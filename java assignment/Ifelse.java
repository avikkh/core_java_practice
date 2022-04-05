//7 WAP to accept number and check it is Even or odd
  
  import java.util.Scanner;

class Ifelse
{

public static void main(String args[])
  {

 
int num;
Scanner s=new Scanner(System.in);
System.out.println("enter num");

num=s.nextInt();

if(num % 2 == 0)
{
    System.out.println("the num is even");
  }
  else
{
       System.out.println("the num odd");
  }
  
    }
}
