// import Scanner
import java.util.Scanner;
// main class
class Dowhile1
{
// main method
public static void main(String[] args) {

 // declare variables
int num;


// Create an object
Scanner obj = new Scanner(System.in);


 // start do-while
do {
System.out.println("Enter 1 for prime numbers");
System.out.println("Enter 2 for odd numbers");
System.out.println("Enter 0 for exit");

 // initializing the number
System.out.println("Enter the number: ");
num = obj.nextInt();
switch(num) {
case 1: boolean flag = false;
    for (int i = 2; i <= num / 2; ++i) 
    {
      // condition for nonprime number
      if (num % i == 0) 
      {
        flag = true;
        break;
      }
    }

    if (!flag)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");
  break;
      
 case 0:
System.out.println("Bye! Visit again.");
break;

 default:
System.out.println("Invalid Option");
break;
}
System.out.println();
}
while(num != 0);
}
}




  
    