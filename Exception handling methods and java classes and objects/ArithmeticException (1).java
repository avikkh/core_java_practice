/* 1. Write a program to accept two numbers, one Arithmetic operator such as +, -, / , *  and print output of Arithmetic operation. 
   Write switch case to perform each operation. Handle ArithmeticException when you are performing division operation. 


public class ArithmeticException {

    public static void main(String args[]) {

    }
}*/

import java.util.*;
class ArithmeticException
{
    public static void main(String args[])
    {
	    int num1,num2;
      double output=0;
	    char operator;
       Scanner sc=new Scanner(System.in);
	System.out.println("Enter a first number:");
	num1=sc.nextInt();
      	System.out.println("Enter a second number:");
      num2=sc.nextInt();
      System.out.println("Enter a opeartor:");
     	operator=sc.next().charAt(0);
      
        switch(operator)
	{
		case '+':
			output=num1+num2;
			break;
		case '-':
			output=num1-num2;
			break;
		case '*':
			output=num1*num2;
			break;
		case '/':
       try {
              output=num1/num2;
              System.out.println("the number cannot divide by zero");
  } 
  catch (Exception e) 
    {
   System.out.println("the number cannot divide by zero = " + e);
    }     
			output=num1/num2;
			break;
		case '%':
			output=num1%num2;
			break;
		default :
			System.out.println("invalid operation");
			break;
	}
	System.out.println("The Output Is:"+output);
   }
}