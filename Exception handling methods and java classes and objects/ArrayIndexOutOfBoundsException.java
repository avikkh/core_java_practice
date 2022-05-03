/* 3. Write a program which will illustrate ArrayIndexOutOfBoundsException. 
   Create an array variable with n size, accept values from user and store values into array, finally print all values on console. 
   Please write your comments regarding ArrayIndexOutOfBoundsException such as " When ArrayIndexOutOfBoundsException occur in this program?"
*/

public class ArrayIndexOutOfBoundsException
{
 void display()
 {
   //storing data to the array
  int arr[]={ 23,45,77,66};
   //print result
  System.out.println("the array: "+arr[4]);
 } 
  //main method
   public static void main(String[] args)
   {
     //creating object for 
      //ArrayIndexOutOfBoundsException
     ArrayIndexOutOfBoundsException ex=new 
     ArrayIndexOutOfBoundsException();
     //calling display function by object of a class
     ex.display();
   }
}

//there is no value in index array of 4 so its show exception as ArrayIndexOutOfBoundsException beacuse array are fixed size values declared in variable declare section.
//The ArrayIndexOutOfBoundsException is a Runtime Exception thrown only at runtime.


// Very Good!
