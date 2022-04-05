// 9 WAP to accept week_number and print weekday
  //  1 -- monday
  //  2. tuesday
 //   7 sunday 
//WAP to read week number and print weekday
import java.util.Scanner;
class Weeknumber {
  public static void main(String args[])
   {
      Scanner s=new Scanner(System.in);
   System.out.println("Enter week number to print weekday");

     int week_num=s.nextInt();
     if(week_num==1){
       System.out.println("Sunday");
     }
     else if(week_num==2){
       System.out.println("Monday");
     }
     else if(week_num==3){
       System.out.println("Tuesday");
     }
     else if(week_num==4){
       System.out.println("Wednesday");
     }
     else if(week_num==5){
       System.out.println("Thursday");
     }
     else if(week_num==6){
       System.out.println("Friday");
     }
     else if(week_num==7){
       System.out.println("Saturday");
     }
     else{
       System.out.println("Invalid week number");
     }
     
  }
}
