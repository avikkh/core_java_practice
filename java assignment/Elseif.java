 

//11. WAP to accept 3 numbers and find max number


import java.util.Scanner;


 class Elseif
{
  // ctreate main method
  public static void main(String args[])
  {
//declare variables
    int a,b,c;
    //ctreate an object using scanner class
    Scanner s= new Scanner(System.in);
      //asking user to give a value
    System.out.println("Enter a value");
    a=s.nextInt();
    System.out.println("Enter b value");
    b=s.nextInt();
    System.out.println("Enter c value");
    c=s.nextInt();
    // Starting else condtion to check greatest number
    if(a>b && a>c)
    {
      System.out.println(a+ " is greater ");
    }
    else if( b>c)
    {
      System.out.println(b+ " is greater");
    }
    else
    {
      System.out.println(c+ " is greater");
        }
  }
   
}
  
  

