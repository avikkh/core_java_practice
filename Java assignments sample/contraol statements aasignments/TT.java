import java.util.Scanner;

public class TT
{  
  
public static void main(String args[])
  {  
    
 Scanner s=new Scanner(System.in);
  System.out.println(" enter the number of rows ");
     int rows=s.nextInt();
  System.out.println(" enter the number of columns ");
     int columns=s.nextInt();
  
 int original[][]= new int[rows][columns];
 System.out.println(" enter the matrix numbers ");
   for(int i=0;i<rows;i++)
   {    
     for(int j=0;j<columns;j++)
       {    
         original[i][j]=s.nextInt();
       }   
   }    
      
    
System.out.println(" the matrix numbers entered are ");  
for(int i=0;i<rows;i++)
   {    
     for(int j=0;j<columns;j++)
     {    
         System.out.print(original[i][j]+" ");    
     }    
     System.out.println();//new line    
   }    



    //creating another matrix to store transpose of a matrix  
int transpose[][]=new int[rows][columns];  //3 rows and 3 columns  
    
//Code to transpose a matrix  
for(int i=0;i<rows;i++)
    {    
     for(int j=0;j<columns;j++)
        {    
           transpose[i][j]=original[j][i];  
        }    
    }    
System.out.println(" the transpose of the matrix is ");  

for(int i=0;i<rows;i++)
  {    
      for(int j=0;j<columns;j++)
      {    
            System.out.print(transpose[i][j]+" ");    
}    
System.out.println();//new line    
}    
}
}  