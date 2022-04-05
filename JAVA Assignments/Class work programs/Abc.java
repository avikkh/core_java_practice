import java.util.Scanner;
class Abc
  {
    public static void main(String args[])
    {
      int i=1,sum=0;
      Scanner s=new Scanner(System.in);
      System.out.println("enter the number");
      int n=s.nextInt();
      
      for(i=1;i<=n;i++)
      {
        if(i%2==0){
        
        sum=sum+i;
          }
      // System.out.println(sum);
          
        
        
      }
      System.out.println( +sum);
      
      
    }
  }
