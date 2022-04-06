class Frequency {

  public static void main(String args[]){

    int count=1;
    int arr[]={23,78,45,12,23,23,12,90};

    for(int i=0;i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++){

        if(arr[i]==arr[j]){
          count++;
          arr[j]=0;
        }
      }
      if(arr[i]!=0){
      System.out.println(arr[i]+"  :  "+count);
        }
      count=1;
      }
     
  
}
}