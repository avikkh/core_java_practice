class Fibonaci{  
public static void main(String args[])  
{    
 int f1=0,f2=1,f3,i,n=10;    
 System.out.println(+f1);   
  System.out.println(+f2);   
    
 for(i=2;i<n;i++)   
 {    
  f3=f1+f2;    
  System.out.println(+f3);    
  f1=f2;    
  f2=f3;    
 }    
  
}
} 