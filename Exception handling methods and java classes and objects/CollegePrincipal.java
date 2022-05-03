/* JFM1T9_Assignment4:
     Extend and enhance the previous inheritance program where collegeName, designation and 
     work() method are common to all the teachers and declared in the base class in the way
     that all child classes like MathTeacher, EnglishTeacher and MusicTeacher do not need to 
     write this code and can use directly from base class. 

     Sample Output:
     Math Teacher         IIT
     English Teacher      IIT
     Music Teacher        IIT


*/

class Teachers
{
  //Declare variables
  String name="";
  String designation="IIT";
  public  void work()
   {
     System.out.println("teaching ");
   }
}

//Add MathTeacher class
class MathTeacher extends Teachers
{
  void maths()
  {
    //initialize a variable
    name="Math Teacher";
     //print result
    System.out.println(name+"    "+designation);
  }
}
//Add EnglishTeacher class
class EnglishTeacher extends Teachers
{
  void english()
  {
    //initialize a variable
    name="English Teacher";
     //print result
    System.out.println(name+"    "+designation);
  }
}
//Add MusicTeacher class
class MusicTeacher extends Teachers
{
  void music()
  {
    //initialize a variable
    name="Music Teacher";
    //print result
    System.out.println(name+"    "+designation);
  }
}
class CollegePrincipal 
{
  //main method
  public static void main(String[] args)
  { //creating object for class MathTeacher
    MathTeacher math=new MathTeacher();
    //creating object for class EnglishTeacher
    EnglishTeacher eng=new EnglishTeacher();
    //creating object for class MusicTeacher
    MusicTeacher mus=new MusicTeacher();
    //call the method of calsses using object 
    math.maths();
    eng.english();
    mus.music();
  }
}






