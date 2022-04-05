//  WAP to accept marks and check the marks is valid or not.
import java.util.Scanner;
class Validornot {
  public static void main(String args[])
   {
      Scanner s=new Scanner(System.in);
       int marks=0;
  System.out.println("Enter your marks to check it is valid or not");
     marks=s.nextInt();
     if(marks>=0 && marks<=100){
       System.out.println("Valid marks");
     }
     else{
       System.out.println("Invalid marks");
     }
     
  }
}