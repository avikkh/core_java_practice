// 1. WAP to check the given element is present in the array or not.
import java.util.Scanner;
class Array4{

 public static void main(String args[]){

 Scanner s=new Scanner(System.in);
int arr[]=new int[10];
int size=6;
System.out.println("Enter"+ size+" values");
for(int i=0;i<size;i++ ){
arr[i]=s.nextInt();
}
int index=7,value=100;

if(index>=0 && index<size){

 for(int i=size+1;i>index;i--){

 arr[i]=arr[i-1];
}
arr[index]=value;
size++;
}
else{
System.out.println("Invalid index position");
}

 for(int i=0;i<size;i++){
System.out.print(arr[i]+" ");
}
}
}