import java.util.Scanner;
class Array{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter N value (Array Size) :");
    int n=s.nextInt();
    int arr[]=new int[n];
    int sum=0;
    System.out.println("Enter "+n+" values");
    for(int i=0;i<n;i++){
      arr[i]=s.nextInt();
    sum=sum+arr[i];
      }
    System.out.println("the sum of array is =" +sum);
  }
}