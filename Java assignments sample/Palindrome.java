import java.util.Scanner;
class Palindrome{  
 public static void main(String args[]){  
  int r,sum=0,temp;
   Scanner s=new Scanner(System.in);
   System.out.println("Enter the number ");
   
  int n=s.nextInt(); //It is the number variable to be checked for palindrome  
  
  temp=n;    
  while(n>0){    
   r=n%10;  //getting remainder  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println(sum+ " is a palindrome number");    
  else    
   System.out.println(sum+ " is not palindrome");    
}  
}  