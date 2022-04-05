import java.util.Scanner;
class Vowels {
  public static void main(String args[])
   {
      Scanner s=new Scanner(System.in);
   System.out.println("Enter vowels");

     char ch=s.next().charAt(0);


switch(ch)
{
     case 'a' :
	   case 'e' : 
     case 'i' : 
	   case 'o' : 
	   case 'u' : 
	   case 'A' : 
	   case 'E' : 
	   case 'I' : 
	   case 'O' : 
	   case 'U' :  System.out.println(ch+" is  a Vowel");
    break;
 default:
           System.out.println(ch+" is consonets");    

}
}
     }