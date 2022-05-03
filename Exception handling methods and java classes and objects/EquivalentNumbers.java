/* JFM1T7_Assignment3:

   Accept an integer number as input from the console and when the program is executed print the binary, octal and hexadecimal equivalent of the given number.
   Prompt the user for the  values to be input from the terminal
   Hint: Refer Java Documentation and look for the appropriate Wrapper class method

   Sample Input: 20
   
   Expected Output: Binary equivalent: 10100 Octal equivalent: 24 Hexadecimal equivalent: 14
   


public class EquivalentNumbers {

//Main method

//initialize Convert class constructor

//create Scanner object

//take input from user

//convert numbers into hexa,octal and binary

//print result
     
}

//create Convert class in that declare variables

//add getters and setters method
*/


import java.util.Scanner;
class Person
{ 
//declare number 
private int n;
//create setters and getters
//convert numbers into binary
public void getbinary()
  {
 System.out.println("Binary equivalent :"+Integer.toBinaryString(n));
  }  
  //convert numbers into octal 
  public void getoctal()
  {
  System.out.println("Octal equivalent :"+Integer.toOctalString(n)); 
  }
  //convert numbers into hexa
  public void gethexadecimal()
  {
  System.out.println("Hexadecimal equivalent :"+ Integer.toHexString(n)); 
  }  
public void setnum(int number)
  {
    n=number;
  }
}

class EquivalentNumbers { 
//main method
public static void main(String args[]) { 
//create Scanner object
Scanner s= new Scanner(System.in);
//take input from user
System.out.println("Enter a number");
int n=s.nextInt();
Person p= new Person();
 
p.setnum(n);
//print result
  p.getbinary();
  p.getoctal();
  p.gethexadecimal();

}  
}