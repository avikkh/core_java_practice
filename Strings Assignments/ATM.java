import java.util.Scanner;
class ATM{
double ac_bal=10000;
  char a;
Scanner s=new Scanner(System.in);
public void no_of_Notes(int amt){
int a=0,b=0,c=0;
if(amt>=500){
a=amt/500;
amt=amt-(a*500);
System.out.println("500 rupees notes are: "+a);
}
if(amt>=200){
b=amt/200;
amt=amt-(b*200);
System.out.println("200 rupees notes are: "+b);
}
if(amt>=100){
c=amt/100;
System.out.println("100 rupees notes are: "+c);
}
}
public void deposite(){
System.out.println("Enter your deposite amount");
int amt=s.nextInt();
if(amt%100==0){
ac_bal=ac_bal+amt;
}
else{
System.out.println("Please enter multiples of 100 only");
}

 System.out.println("Avaiable bal: "+ac_bal);
}
public void withdraw(){
System.out.println("Enter Withdraw amount");
int amt=s.nextInt();
if(amt%100==0){
if(amt<=20000){
if(amt<=ac_bal){
ac_bal=ac_bal-amt;
no_of_Notes(amt);
System.out.println("Avaiable bal: "+ac_bal);
}
else{
System.out.println("Insuffient fund");
}
}
else{
System.out.println("Withdraw limit is 20000 only");
}
}
else{
System.out.println("Please enter multiples of 100 only");
}
}
 
public void viewOptions(){
 do{ 
System.out.println("1. Deposite");
System.out.println("2. Withdraw");
System.out.println("3. Bal Enquiry");
System.out.println("0. EXIT");
System.out.println("Choose your option");
int option=s.nextInt();
if(option==1){
deposite();
}
else if(option==2){
withdraw();
}
else if(option==3){
}
else if(option==0){
System.out.println("Thank you, Visit again");
}
else{
System.out.println("Invalid option");
}

  System.out.println("Do You Want To Continue(Y/N)");
    a = s.next().charAt(0);
} while(a == 'Y'|| a == 'N');
  }
   

public void validate(){
int pin=1234;
System.out.println("Enter pin number");
pin=s.nextInt();
if(pin==1234){
viewOptions();
}
else{
System.out.println("Invalid pin");
}
}

public static void main(String args[]){

 ATM bank=new ATM();
bank.validate();
}

}