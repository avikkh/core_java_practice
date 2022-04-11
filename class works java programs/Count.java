import java.util.Scanner;
class Count{
  //main method
  public static void main(String args[]){

    // declare variables
    int count=0,i,num,size,temp;
    Scanner s=new Scanner(System.in);
    
    System.out.println("enter a numbers");
      num=s.nextInt();
    temp=num;
  
      while(temp!=0)
        {
      
          temp=temp/10;
          count++;
          
        }
    
System.out.println("the count of number is="+count);
    }
  }
