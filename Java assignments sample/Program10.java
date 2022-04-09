// 10. WAP to accept basic salary and find gross salary.
 // Gross_salary= basic+HRA+DA
   // if basic salary <10000
     //     DA is 70% on basic
       //   HRA is 65% on basic 
   //basic salary is between 10000 to 20000
     //    DA is 75% on basic
       //  HRA is 73% on basic
   //basic salary above 20000
     //    DA is 80% on basic
       //   HRA is 76% on basic

import java.util.Scanner;

class Program10
{
     public static void main(String args[]){
    Scanner s=new Scanner(System.in);
float HRA,DA,gs,basic_salary;
System.out.println("Enter basic salary");
basic_salary=s.nextInt();
  if(basic_salary<10000)
  {
   HRA=(float) ((basic_salary/100)*65);
   DA=(float) ((basic_salary/100)*70);
   gs=basic_salary+HRA+DA;
    System.out.println("The gross salary="+gs);
    }
//System.out.println(gs);

    if(basic_salary>=10000 && basic_salary<=20000)
  {
   HRA=(float) ((basic_salary/100)*73);
   DA=(float) ((basic_salary/100)*65);
   gs=basic_salary+HRA+DA;
    System.out.println("The gross salary="+gs);
    }
//System.out.println("The gross salary="+gs);

       if(basic_salary>=20000)
  {
   HRA=(float) ((basic_salary/100)*76);
   DA=(float) ((basic_salary/100)*80);
   gs=basic_salary+HRA+DA;
    System.out.println("The gross salary="+gs);
    }
}
}