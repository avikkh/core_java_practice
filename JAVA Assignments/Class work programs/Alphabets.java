import java.util.Scanner;

class Alphabets{
public static void main(String args[])
{
  Scanner s=new Scanner(System.in);
    System.out.println("enter the character");
char ch =s.nextLine().charAt(0);
  System.out.println("the alphabets from A TO Z are");

while(ch<='z')
{
System.out.print(ch+ " ");
ch++;
}
}
}
