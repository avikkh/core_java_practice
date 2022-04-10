// import Scanner class
import java.util.Scanner;

 

// InvalidAgeException class
class Invalid_Colour_Exception extends Exception
  {
    public Invalid_Colour_Exception(String str)
    {
      super(str);
    }
  }

 

 

// main class
class InvalidColour1
  {
    // main method
    public static void main(String args[]) 
    {

 

      Scanner sc = new Scanner(System.in);

 

      System.out.println("Enter your colour: ");
      String str = sc.next();

 

      try 
        {
          // entered - pink, voilet or purple => exception
          if(str == "Red" && str == "Black" && str == "Blue" && str == "Yellow" && str == "Green" && str == "Orange" && str == "White") {
            throw new Invalid_Colour_Exception("You have entered Invalid Colour");
          }
            // entered - red, black, blue => print the colour
          else{
            System.out.println("You have entered " +str+ " colour");
          }
        }

 

      catch(Invalid_Colour_Exception ice) 
        {
          System.out.println(ice.getMessage());
          System.out.println("Invalid Colour");
        }

 

      System.out.println("Printing my main method");

 

      
    }
  }