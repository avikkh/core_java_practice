//WAP to print unique elements in an array.

//WAP to print duplicate elements in an array.
public class Array3 {
    public static void main(String[] args) {     
         
        //Initialize array  
        int arr[]= new int[] {2,4,6,8,4,2,9,8,3,6};  
         
        System.out.println("Duplicate elements in given array: ");
        //Searches for duplicate element
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    System.out.print(arr[j]+ " ");
            }
        }
    }
}