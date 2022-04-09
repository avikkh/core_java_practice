
import java.util.Scanner;

class FirstLastdigit
{   
    public static void main(String args[]) 
    {   
      Scanner s= new Scanner(System.in);
      System.out.println("Enter the numbers");
      
        int number = s.nextInt();
        int firstDigit = 0;
        int lastDigit = 0;
        int sum;
        lastDigit = number%10;
         while(number!=0) {
            firstDigit = number%10;
            number /= 10;
        }
      sum=firstDigit+lastDigit;
        System.out.println("First digit: "+sum);
    }
}