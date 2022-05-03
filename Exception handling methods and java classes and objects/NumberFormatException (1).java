/* 3. Write a program to accept firstName, lastName and mobileNumber in string format. 
   Print number of characters in firstName and lastName, and print sum of digits of a mobileNumber. 
   Handle NumberFormatException while converting mobileNumber to long.
*/

//public class NumberFormatException {

    //public static void main(String args[]) {

   // }
//}
// Java program to compute
// sum of digits in number.
/*import java.util.Scanner; 
public class NumberFormatException {

    public static void main(String args[]) {
      String f,la;
        String m;
      int count=0,count1=0,sum=0;
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the first name");
      f=s.nextLine();
      System.out.println("Enter the Last name");
      la=s.nextLine();
      System.out.println("Enter the Mobile number");
      //for(int i=0;i<10;i++){
      m=s.nextLine();
       // }
      for(int i=0;i<f.length();i++)
      {
        count++;
      }
      System.out.println("The number of characters :" +count);
      for(int i=0;i<la.length();i++)
      {
        count1++;
      }
     // long [] num=new long[10];
      
      System.out.println("The number of characters :" +count1);
     
      try {
         long num= Long.parseLong(m);
         System.out.println("long num= " + num);
      } catch(Exception nfe)
        {
         System.out.println("NumberFormatException: " + nfe.getMessage());
      }
      for (sum = 0; num > 0;num = num / 10);  {
       sum=sum+num%10;
        }
          
          System.out.println("the sum of digits of mobile number is :"+sum);
          }  
      

}*/


