/*  JFM1T8_Assignment1:

    Write a program to convert an int variable to String using an inbuilt function of String class and print the char at index position 2.
    Prompt the user input from the terminal.
    
    Sample input: 54321
    
    Expected output: char at index position 2 = 3
*/

import java.util.Scanner;

public class IntToString {
//main method
  public static void main(String args[]){
//declare int type variable
  int n;
  Scanner s=new Scanner(System.in);
//take input from user
  System.out.println("Enter a numbers");
  n=s.nextInt();
//converting integer to string using toString method
  String str = Integer.toString(n);
//use inbuilt function to print index position
//print result   
   System.out.println("char at index position 2 is = " +str.charAt(2));
  }
}

