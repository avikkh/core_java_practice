/*JFM1T9_Assignment2:
    Write a BankAccount class with members account_number and account_balance  and prevent other class objects 
    (assuming them as hackers who can steal your confidential information) to access BankAccount details.
    Steps to Follow:
    Step1: Create account_number and account_balance as member variables for BankAccount class
    Step 2: Add setter and getter methods for the above member variables 
    Prompt the user for the  values to be input from the terminal.

    Sample Input:
    Enter BankAccount Number : 6789023
    Enter Current Balance    : 67,000.89

    Expected Output:
    BankAccount Number : 6789023
    Current Balance    : 67000.89
    
*/
import java.util.Scanner;
class BankAccount 
{ 
 //declare varible
  int Bankaccount_number;
  float bankbalance;
 //create getters and setters method
 public int getAccountnumber()
  {
    //return value
    return Bankaccount_number;
  }  
  public float getAccountbalance()
   {
     //return value
     return bankbalance;
    }  
     
     public void setAccount(int newAccountnumber,float 
     newbalance)
     { 
      Bankaccount_number = newAccountnumber;
      bankbalance=newbalance;
     }
}

class ExpertHacker
{ 
 //main method
  public static void main(String args[]) 
  { 
   //create a object for scanner
    Scanner s=new Scanner(System.in);
   //Take input from user
    System.out.println("enter a Account number");
      int Bankaccount_number=s.nextInt();
    System.out.println("enter a bank balance");
     nfloat bankbalance=s.nextFloat();
   //Create an object of BankAccount class 
    BankAccount b= new BankAccount();
   //pass two parameter to setter method
    b.setAccount(Bankaccount_number,bankbalance);
    // Print account_number and account_balance 
    System.out.println("BankAccount Number :" + 
     b.getAccountnumber());
     System.out.println("Current Balance    :" + 
     b.getAccountbalance());
  }  
}






