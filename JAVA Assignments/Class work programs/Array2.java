import java.util.Scanner;
class Array2{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter N value (Array Size) :");
    int n=s.nextInt();
    int arr[]=new int[n];
    int Esum=0,Osum=0;
    System.out.println("Enter "+n+" values");
    for(int i=0;i<n;i++){
      arr[i]=s.nextInt();
      if(arr[i]%2==0){
           Esum=Esum+arr[i];
        }
        else
        {
           Osum=Osum+arr[i];
        }
      }
      
    System.out.println("the sum of even array is =" +Esum);
    System.out.println("the sum of odd array is =" +Osum);
    
    
  }
}