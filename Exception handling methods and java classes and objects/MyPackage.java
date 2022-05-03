/*  JFM1T6_Assignment5:
    Write a class "MyClass" in package "mypack" and access it from other class outside the package "mypack".

    Sample Output:
    Welcome to Packages
*/

//create a package name mypack, inside a folder called mypack, and create a class MyClas. In that create Display method and  print message


//package Mypack.Myclass;
//package Mypack;
import MyPack.Myclass;
class MyPackage
{
    //main method  
  public static void main(String args[])
  {
      //creating a object for Myclass   
      Myclass obj = new Myclass();
      // call display methods();
      obj.display();
  }
}  

// Very Good!
