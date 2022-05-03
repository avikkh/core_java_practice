/* JFM1T6_Assignment3:

   Write a method that takes any numbers as arguments/parameters and return the mean value back to main method.
   Prompt the user for the  values to be input from the terminal.

   Sample input:
   num1 = 3
   num2 = 2
   num3 = 4

   Expected Output:
   result = 3
*/


import java.util.Scanner;
public class Mean
{ 
  //Declare variable and initialize
   int sum=0;
   public int find(int a,int b,int c)
   { 
     //Calculate mean
     sum=(a+b+c)/3; // return a mean value.
      return sum;
   }
   //main method
  public static void main(String[] args) 
     {
       //Create an obejct of class Mean.
       Mean t = new Mean();
       //declare variables and initialize s
       int num1,num2,num3;
       Scanner s=new Scanner(System.in);
       //take input from user
       System.out.println("enter a 3 numbers");
       num1=s.nextInt();
       num2=s.nextInt();
       num3=s.nextInt();
       //passing paramaeter to a function to find mean       
       int mean = t.find(num1,num2,num3); 
       //Displaying the result.    
       System.out.println("result: " +mean);
     }
}