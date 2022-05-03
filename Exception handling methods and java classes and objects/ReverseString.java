/*  JFM1T8_Assignment5:

    Write a program to reverse a string using StringBuffer. Reverse entire sentence in string and also reverse each word in the string. 
    Prompt the user input from the terminal.
    
    Sample input: Learning made easy at bitLabs
    
    Expected output:
    reversing entire string: sbaLtib ta ysae edam gninraeL
    reversing each word at its place: gninraeL edam ysae ta sbaLtib  
*/

import java.util.Scanner;
class ReverseString {
public static void main(String args[])
{
//create scanner object 
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the string");
 String str=sc.nextLine();
//creat stringbuffer object for string reversing
 StringBuffer sbf = new StringBuffer(str);
//reverse input string
 sbf.reverse();
//print entire string result
 System.out.println("Reversed string using StringBuffer = "+sbf);

 StringBuffer s=new StringBuffer();
/* Use split() method of String class splits a string in several strings based on the delimiter passed as an argument to it */
 String words[]=str.split(" ");
 for(int i=0;i<words.length;i++)
 {
   for(int j=words[i].length()-1;j>=0;j--)
     {
   //Use charAt() function returns the character at the 
    //given position in a string
       s.append(words[i].charAt(j));
     }
       s.append(" ");
 }
//print reverse each word string result
  System.out.println("Reversed each word in string after split method is=" +s);
 }
}