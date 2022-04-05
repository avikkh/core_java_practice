// WAP to accept salary and 3 shopping bills from user and find 
 //  1. total shopping amount
  

 //2. find how much % of amount he/she spent on shopping on his salary.

 



import java.util.Scanner;

class Shopping
{

public static void main(String args[]){

 
float cloth,shoe,book,salary,shoppingbill,percentage;
Scanner s=new Scanner(System.in);

System.out.println("enter 3 shoping bills");
cloth=s.nextInt();
shoe=s.nextInt();
book=s.nextInt();
System.out.println("enter total salary of the employee");
salary=s.nextInt();

shoppingbill=cloth+shoe+book;
percentage=(float)((shoppingbill/100)*salary);
System.out.println("the total shopping bill the employee spend=" + shoppingbill);
System.out.println("the percentage of salary spend in shopping is = " +percentage);
}
}
