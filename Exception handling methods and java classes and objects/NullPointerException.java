/*4. Write a program which will illustrate NullPointerException. Create student class along with name, marks and city and add setter methods and getter methods.
  Create a method which can take student class as a parameter and print name, marks and city in method business logic.
  Write your comments regarding NullPointerException such "When NullPointerException will occur in program?"
*/

public class  NullPointerException
{
 void display()
 {
   //Declare a varible, array and initialize
   int i=0;
   int arr[]=null;
   System.out.println("the array: "+arr[i]);
 }
  //main method
  public static void main(String[] args)
   {
     //creating object of class NullPointerException
     NullPointerException ex=new NullPointerException();
     ex.display();
   }
}
//we not assigned any values to the arr[] is kept as null. accessing or printing this array show as nullpointerexception.
//NullPointerException is thrown when program attempts to use an object reference that has the null value.occur at runtime 