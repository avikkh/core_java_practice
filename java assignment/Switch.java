
import java.util.Scanner;
class Switch {
  public static void main(String args[])
   {
      Scanner s=new Scanner(System.in);
   System.out.println("Enter week number to print weekday");

     int week_num=s.nextInt();

switch(week_num)
{
  case 1:   
                 System.out.println("Sunday");
                  break;
case 2:   
                 System.out.println("tuesday");
                  break;
     
case 3:   
                 System.out.println("wednesday");
                  break;
     
case 4:   
                 System.out.println("thursday");
                  break;
     
case 5:   
                 System.out.println("friday");
                  break;
case 6:   
                 System.out.println("saturday");
                  break;
     
case 7:   
                 System.out.println("Sunday");
                  break;
default:
            System.out.println("wrong choice");
}
}
}