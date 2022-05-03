/* 1. Write a program which will illustrate ArthmeticException. Create a parameterized method which can take two values and print division of two numbers. 
Please write your comments regarding ArithmeticException such as "When ArithmeticException will occur in this program?"
*/


public class ArithmeticException
{
 void division(int a,int b)
 {
   // number cannot divide by zero its show Airthmetic 
   //exception
   int div=a/b;
   System.out.println("Value after division: "+div);
 } 
   //main method
   public static void main(String[] args)
   {  
     //creating object for airthmaticException
     ArithmeticException Ar=new ArithmeticException();
      //passing two parameters to method
      Ar.division(10,0);
   }
}

//When we perform a division where 0 is used as a divisor, i.e., 0 comes as the denominator
//Any number divided by zero gives the answer “equal to infinity.” Unfortunately, no data structure in the world of programming can store an infinite amount of data. Hence, if any number is divided by zero, we get the arithmetic exception .ArithmeticException belongs to unchecked exception, it is a run-time error. 

// Very Good!


