/* JFM1T4_Assignment3:
   Write a program to print all the prime numbers between 2 numbers.
   Prompt the user to enter the 2 numbers.
   
   Sample Input:
   Enter starting Number: 20
   Enter ending Number: 30

   Expected Output:
   Prime numbers between 20 and 30 are : 
   23
   29

*/

//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;

public class PrimeNumbers {

//Add main method here
public static void main(String args[])
  {
    
//Declare variables num1, num2, i, count and initialize count as zero
    int startnum,endnum,i,j;
    

//Use the scanner class to provide input at execution time using scanner object
Scanner s= new Scanner(System.in);


//Take start value as input and read using scanner object
System.out.print("Enter Starting Number : ");
 startnum= s.nextInt();


//Take end value as an input and read using scanner object
    System.out.print("Enter Ending Number : ");
    endnum= s.nextInt();


//check for all the integer numbers which is between the two numbers given, using for loop
for(i=startnum; i<=endnum;i++)
{ 
    for(j=2;j<=i;j++)
      {
      if(i%j==0){
      break;
      }
    }
  if(i==j){
    System.out.println(i);
    }
  }
    }
}


     
