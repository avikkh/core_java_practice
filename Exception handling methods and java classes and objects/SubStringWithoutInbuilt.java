/*  JFM1T8_Assignment3:

    Write a program to find a substring in a string without using an inbuilt method of String class.
    Prompt the user input from the terminal.
    
    Sample input: Learning made easy at bitLabs
    Enter search string: bitLabs
    
    Expected output: bitLabs is found
    
    Enter search string: bitlab
    Expected output: bitlab is not found

*/
import java.util.Scanner;
public class SubStringWithoutInbuilt {
 static boolean  isSubString(String a,String b){
  String word[]=a.split(" ");
//check two strings if the search string is present then return true else return false
    for(String w:word){
    if(w.equals(b)){
      return true;
      }  
    }
    return false;
  }
  public static void main(String[] args){
//declare variables
//take input from user
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter a string : ");
  String a=sc.nextLine();
//compare two strings if the search string found or not without using inbuilt method isSubString()
  System.out.print("Enter search string: ");
    String b=sc.nextLine();
//creat isSubString method in that declare variable 
  boolean t=isSubString(a,b);
    if(t==false){
      System.out.println(b +" is not found");
    }
    else
    {
      System.out.println(b +" is  found");
    }
  }
}

 