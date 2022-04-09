import java.util.Scanner;

class Findfirstandlast
{   
    public static void main(String args[]) 
    {   
      Scanner s= new Scanner(System.in);
      System.out.println("Enter the numbers");
      
        int number = s.nextInt();
        int firstDigit = 0;
        int lastDigit = 0;

        lastDigit = number%10;
        System.out.println("Last digit: "+lastDigit);
 
        while(number!=0) {
            firstDigit = number%10;
            number /= 10;
        }
        System.out.println("First digit: "+firstDigit);
    }
}