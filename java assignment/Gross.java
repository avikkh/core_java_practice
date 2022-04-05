
//4 WAP to accept basic salary and find gross salary.
 //Gross_salary= basic+HRA+DA
// DA is 80% on basic
 //HRA is 76% on basic

 



 import java.util.Scanner;

class Employee
{

public static void main(String args[]){

 
Scanner s=new Scanner(System.in);



 float a,hra,da,gs,b,c;
System.out.println("Enter basic salary");

a=s.nextInt();
System.out.println("Enter hra percentage");

hra=s.nextInt();
System.out.println("Enter da percentage");

da=s.nextInt();
  b=(float) ((a/100)*hra);
   c=(float) ((a/100)*da);
gs=a+b+c;

System.out.println(gs);
}
}