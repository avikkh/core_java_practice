import java.util.Scanner;

class Number{
public static void main(String args[])
{
  int i=1;
  Scanner s=new Scanner(System.in);
    System.out.println("enter a number");
int num =s.nextInt();
  System.out.println("the all n nutural numbers are" +num);

while(i<=num)
{
  
System.out.print(i+ " ");
i++;
}
}
}
