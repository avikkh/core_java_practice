
//14. WAP to accept project marks, external marks, internal marks from student,
   //--> check if student got pass in project, internal //and externals. 
  //  Note: pass mark is : 50
   //--> if student got pass in project, internal and external then find total score.
   //  total_score= 70% from project+ 20% from external + 10% internal 
  // --> print grades based on total_score
     //   total_score >=90    --> A grade
      //  75--90      --> B grade
        //        50- 75      --> C grade
  // ---> print failed subject name along with the score.
           

import java.util.Scanner;
class Score {
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
       if(total>=90){
         System.out.println("A grade");
       }
       else if(total>=70){
         System.out.println("B Grade");
       }
       else{
         System.out.println("C grade");
       }
     }
     else {

       if(project<50){
         System.out.println("Failed in project and score is : "+project);
         
       }
       if(external<50){
         System.out.println("Failed in external and score is : "+external);
         
       }
       if(internal<50){
         System.out.println("Failed in internal and score is : "+internal);
         
       }
       
     }
  }
}