import java.util.Scanner;
class Array2{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter N value (Array Size) :");
    int n=s.nextInt();
    int arr[]=new int[n];
    int sum=0;
    System.out.println("Enter 10 values");
          arr[i]=s.nextInt();

    for(int i=0;i<n;i++){
      //arr[i]=s.nextInt();
      
           sum=sum+arr[i];
        
      
      }
      
    System.out.println("the sum of sum ofarray is =" +sum);
    
    
    
  }
}