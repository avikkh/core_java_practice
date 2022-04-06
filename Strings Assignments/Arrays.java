// 1. WAP to check the given element is present in the array or not.

class Arrays{

  public static void main(String args[]){

   int arr[]={23,89,34,55,90,11};
        boolean b=false;
    int key=90;

    for(int i=0;i<arr.length;i++){
      if(key==arr[i]){
        b=true;
      }
    }
    if(b){
      System.out.println(key+ " Yes, The element is present in the the array");
    }
    else{
      System.out.println(key+" No, The element is not present in the array");
    }
 
}
}