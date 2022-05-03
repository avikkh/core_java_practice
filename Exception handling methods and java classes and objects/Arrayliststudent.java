// import ArrayList and Iterator
import java.util.ArrayList;
import java.util.Iterator;

 

// class Student
class Student 
  {
    int roll, age;
    String name;

 

    // constructor
    Student(int roll, String name, int age)
    {
      this.roll = roll;
      this.name = name;
      this.age = age;
    }
  }

 

// main class
class Arrayliststudent
  {
    // main method
    public static void main(String[] args)
    {
      // creating an object for user-defined class Student
      Student s1 = new Student(101, "Lalitha", 26);
      Student s2 = new Student(102, "Meghana", 25);
      Student s3 = new Student(103, "Havilah", 28);

 

      // create an object for ArrayList
      ArrayList<Student> al = new ArrayList<Student>();

 

      al.add(s1);
      al.add(s2);
      al.add(s3);

 

      // create an object for Iterator
      Iterator it = al.iterator();

 

      while(it.hasNext())
        {
          Student st = (Student)it.next();
          System.out.println("Roll - "+st.roll+ "\t Name - "+st.name+ " \t Age - "+st.age);
          
        }
    }
  }