/*  JFM1T8_Assignment4:

    Write a program to check whether a string is a Palindrome.
    Prompt the user input from the terminal.
    
    Sample input: Malayalam
    
    Expected output: Malayalam is a Palindrome
*/
import java.util.Scanner;

public class Palindrome {
  
//main method
 public static void main(String args[]) {
 Scanner s = new Scanner(System.in);
  
//declare varible
  int count = 0;
//take input from user
  System.out.println("Enter any Name"); 
  String str = s.next();

/*divide the whole string into two halves and compare each character in the first half with each character in the second half in reverse. */
  int length = str.length();
  int first_half = length/2;
  String rev_str = "";
  char ch[] = str.toCharArray();

 for(int i = length-1; i >= 0; i--)
   {
    rev_str = rev_str + ch[i];
   }
  int second_half;
  if(length % 2 == 0)
    {
     second_half = rev_str.length() / 2;
    }
    else
    {
     second_half = (rev_str.length() / 2) + 1;
    }
/* If both are equal then it is a palindrome else print it is not a palindrome*/
  for(int i = 0; i < first_half; i++)
   {
    for(int j = 0; j < second_half ; j++)
      {
        if(ch[i] == ch[j])
          {
           count++;
          }
      }
   }
  if(count == 2)
    {
    System.out.println("Entered String is palindrome");
    }
  else
    {
    System.out.println("Entered String is not palindrome");
    }
  }
}