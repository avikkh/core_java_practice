//5 WAP to accept project marks, internal marks and //external marks and find 
 //total marks.
//total_marks= 70% from project+ 20% from external +10% //from internal

 
import java.util.Scanner;
class Program5 {
  public static void main(String args[])
   {
      int total=0;
      Scanner s=new Scanner(System.in);
       int project=0,internal=0,external=0;
     System.out.println("Enter project, extenal and internal score");
     project=s.nextInt();
     external=s.nextInt();
     internal=s.nextInt();
     
      System.out.println("Enter % project to be consider and % internal consider and % external to be consider ");
      int percentageproject=s.nextInt();
     int percentageexternal=s.nextInt();
     int percentageinternal=s.nextInt();
     

     if(project>=50 && external>=50 && internal>=50){

       total=(project*percentageproject)/100 +(percentageexternal*20)/100 +(percentageinternal*10)/100;
       System.out.println("Total score is: "+total);
       }
     }
}
      