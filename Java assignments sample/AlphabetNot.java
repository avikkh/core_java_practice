import java.util.Scanner;

class AlphabetNot {
  public static void main(String[] args) {
   Scanner s= new Scanner(System.in);
    // declare a variable
    System.out.println("Enter a character");
    char ch=s.next().charAt(0);
    

    // checks if c is an alphabet
    if ( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') )
    {
      System.out.println(ch + " is an alphabet.");
    }
    else {
      System.out.println(ch + " is not an alphabet.");
    }
  }
}