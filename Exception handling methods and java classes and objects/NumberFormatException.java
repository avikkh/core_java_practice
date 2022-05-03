/* 2. Write a program which will illustrate NumberFormatException. Create a test method, with in the test method accept two numbers 
   using next() method of scanner class. Convert into numerical values and print addition of two numbers. 
   Please write your comments regarding NumberFormatException such as "When NumberFormatException will occur in this program?"
*/

import java.util.Scanner;
public class NumberFormatException
{
 public static void main( String[] arg)
  {
    //Declare a variable
   String name;
    //creating Scanner object
   Scanner sc = new Scanner(System.in);
    //input from user
   System.out.println("Please Enter your name : ");
   name = Integer.parseInt(sc.next());
    //print result
   System.out.println("Your name is : " +name);
  }
}
//The NumberFormatException occurs when an attempt is made to convert a string with improper format into a numeric value. That means, when it is not possible to convert a string in any numeric type (float, int, etc), this exception is thrown.It is a Runtime Exception (Unchecked Exception) in Java.
//throws Exception as if the input string is of illegal format for parsing as Interger.

