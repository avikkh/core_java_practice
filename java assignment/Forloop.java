import java.util.Scanner;

class Forloop{
public static void main(String args[])
{
  int i,num;
  Scanner s=new Scanner(System.in);
    System.out.println("enter the number");
  num=s.nextInt();
  
  for(i=1;i<=num;i++)
    {
      if(i%2==0)
      {
      System.out.println(i);
        
    }
      else if(i % 2 != 0)
        {
           System.out.println(i);
        }
      }
  }
}