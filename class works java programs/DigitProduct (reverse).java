import java.util.Scanner;

public class DigitProduct {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num;
        
      

        // Take input from user
        System.out.print("Enter any number : ");
        num = scanner.nextInt();

        
         int reverse=0;
        while(num != 0) {

          int remainder = num % 10;
              reverse=reverse*10+remainder;
            // Remove last digit from temp.
            num = num / 10;
        }

        System.out.println("\n reverse of all digits: " + reverse);
    }
}

