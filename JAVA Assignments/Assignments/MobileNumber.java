//JFM1T3_Assignment4:
/*
1.Write a program to store your best friend's mobile number in a variable and print the last 4 digits. Consider the following sample for reference.
  Mobile number should accept only 10 digits. Not less than 10 digits or greater than 10 digits. 
  Allow user to input the phone number from the terminal

  Sample Input:
        mobileNum=9393927890

  Expected Output:
        Your friend's mobile number ends with ******7890

*/

//import statements for java program to read inputs using Scanner class 
 import java.util.Scanner;
 class MobileNumber{
  //Define the main method
public static void main(String args[]){
 
//Declare the variable
long mobile_num;
 // int lastFourDigits;
  //Use the scanner class to provide mobileNum at execution time
Scanner s=new Scanner(System.in);
System.out.println("Enter the 10 digit mobile number");
  mobile_num=s.nextLong();
  //Verify if the mobile number is equal to 10 digits or not
if((mobile_num+"").length()==10){
  System.out.println("The mobile number ends with ******"+mobile_num%10000);
  }
 //  lastFourDigits = //motbile_num.substring(mobile_num.length() - 4 ); 
//ystem.out.println("Mobile number ends with //******"+lastFourDigits);
  
if((mobile_num+"").length()!=10){
  
    System.out.println("The entered number is invalid");
  }
}
}



    
