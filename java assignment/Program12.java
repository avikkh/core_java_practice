//12.WAP to accept units from user and find the bill.
  //for first 50 units the charges are: 0.75p/u
  //next 100 units the charges are: 2.10p/u
  //next 100 units the charges are : 2.50p/u
  //above 250 units the charges are: 2.80p/u

import java.util.Scanner;
public class Program12{
  public static void main(String args[]){
    int units;
    float calculate;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the Units used ");
    units=s.nextInt();

    if(units>=50 && units<100){
      calculate=(float)(units*0.75);
      System.out.println("Electricity bill for 50 units are =" 
          +calculate);
    }
     if(units>=100 && units<200){
      calculate=(float)(units*2.10);
      System.out.println("Electricity bill for 100 units are =" 
          +calculate);
    }
     if(units>=200 && units<250){
      calculate=(float)(units*2.50);
      System.out.println("Electricity bill for 200 units are =" 
          +calculate);
    }
    if(units>250){
      calculate=(float)(units*2.80);
      System.out.println("Electricity bill for more than 250 units are =" 
          +calculate);
      }
  }
}

  
  

 