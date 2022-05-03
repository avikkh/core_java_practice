/*  JFM1T8_Assignment2:

    Write a program to find a substring in a string using an inbuilt method of String class.
    Prompt the user input from the terminal.
  
    Sample input: Learning made easy at bitLabs
    Enter search string : bitLabs
  
    Expected output: bitLabs is found
  
    Enter search string: bitlab
    Expected output: bitlab is not found
*/

import java.util.Scanner;

public class SubStringWithInbuilt 
{
//main method
 public static void main(String args[]){
//declare variables
 Scanner s=new Scanner(System.in);
//take input from user
 System.out.println("Enter a string");
 String str=s.nextLine();
 System.out.println("Enter a substring you want to search");
 String key=s.nextLine();
  
//check if the string contains substring or not if contains print found else print not found
 if (str.contains(key)) 
  {
    System.out.println("The Keyword is found in given string");
  } 
else   
  {
    System.out.println("The Keyword is not found in the string");
  }
 }
}