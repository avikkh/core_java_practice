import java.util.Scanner;
class Switchevenadd {
  public static void main(String args[])
   {
      Scanner s=new Scanner(System.in);
   System.out.println("Enter a number");

     int num=s.nextInt();

switch(num%2)
{
case 0: 
              System.out.println("the entered number is even");
             break;
case 1: 
              System.out.println("the entered number is even");
             break;
default:
        System.out.println("invalid");
}
}
}