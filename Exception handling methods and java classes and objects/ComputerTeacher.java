/* JFM1T9_Assignment3:
     Create a base class Teacher and a sub class ComputerTeacher.
     class ComputerTeacher extends the designation and collegename properties and work() method from base Teacher class,
     you need not declare these properties and method in ComputerTeacher sub class .
     Try accessing these properties using child class object in Main method.
  
     Sample Output:
     Designation       CollegeName
     ComputerTeacher      IIT
*/

class Teacher 
{
 //Declare variable
  String designation = "ComputerTeacher";
  String collegeName = "IIT";
  public void work()
   {
     //printing statement
     System.out.println("Teaching");
   }
}
public class ComputerTeacher extends Teacher
{
 //main method
  public static void main(String args[])
   {
    //create object of a class
     ComputerTeacher obj = new ComputerTeacher();
    //print output
     System.out.println("Designation:" +obj.designation);
     System.out.println("collegeName:" +obj.collegeName);
    //call method using object of a class
     obj.work();
    }
}








