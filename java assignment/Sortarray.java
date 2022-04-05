// WAP to print sorting order of a given array

class Sortarray{

 public static void main(String args[]){

 int temp=0;
int arr[]={34,12,78,90,44,67};

 for(int i=0;i<arr.length;i++){
for(int j=i+1;j<arr.length;j++){

 if(arr[i]<arr[j]){

 temp=arr[i]; // temp=34
arr[i]=arr[j]; // arr[i]=12
arr[j]=temp; //arr[j]=34
}
}
}
for(int i=0;i<arr.length;i++){
System.out.print(arr[i]+" ");
}

}
}