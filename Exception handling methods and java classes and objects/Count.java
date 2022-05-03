import java.util.Scanner;
class Count{
  //main method
  public static void main(String args[]){

    // declare variables
    int count=0,i,size,temp;
    Scanner s=new Scanner(System.in);
    int [] num= new int[10];
    System.out.println("enter a numbers");
    num[i]=s.nextInt();
     
    
  temp=num[i];
      while(temp!=0)
        {
      if(temp < 0){
        
         temp =temp/10;
          count++;
        }
        }
    
System.out.println("the count of number is="+count);
    }
  }
