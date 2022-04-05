import java.util.Scanner;
class While1
  {
    public static void main(String args[])
    {
      int i=1,sum=0;
      Scanner s=new Scanner(System.in);
      System.out.println("enter the number");
      int n=s.nextInt();
      
      while(i<=n)
      {
        sum=sum+i;
       System.out.println(sum);
        i++;
      }
      System.out.println(" n" +sum);
      
      
    }
  }



















