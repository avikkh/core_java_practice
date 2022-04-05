//15. WAP to accept withdraw amount and print number of //notes:
  //     200,100,50,20,10
import java.util.Scanner;
class Program15 {
  public static void main(String args[])
   {
      Scanner s=new Scanner(System.in);
     System.out.println("Enter  amount you want to withdraw");
     int amt=s.nextInt();
     int a=0,b=0,c=0,d=0,e=0;
      if(amt%100==0 || amt%10==0)
     {        
          if(amt>=200)
          {
            a=amt/200;
            amt=amt-(a*200);
            System.out.println("200 rupees notes are : "+a);
          }
          if(amt>=100)
          {
           b=amt/100;
            amt=amt-(b*100);
            System.out.println("100 rupees notes are: "+b);
          }
         if(amt>=50){
           c=amt/50;
           amt=amt-(d*50);
           System.out.println("50 rupees notes are : "+c);
         }
          if(amt>=20){
           d=amt/20;
           amt=amt-(d*20);
           System.out.println("20 rupees notes are : "+d);
   }
        if(amt>=10){
           e=amt/10;
           //amt=amt-(e*10);
           System.out.println("10 rupees notes are : "+e);
       
       
     }
     else
        {
       System.out.println("Invalid amount");
     }
     
  }
} 
}

