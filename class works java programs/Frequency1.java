
import java.util.Scanner;
class Frequency1
{
    public static void main(String arr[])
    {
        Scanner sc=new Scanner(System.in);
        int number,i,count,digit,temp,length;
       System.out.println("Enter length of Number : ");
        length=sc.nextInt();
        System.out.println("Enter any Number : ");
        number=sc.nextInt();
         System.out.println("Digit\tFrequency");
        for(i=0;i<=length;i++)
        {
            count=0;
            temp=number;
            while(temp>0)
            {
                digit=temp%10;
                if(digit==i)
                {
                    count++;
                }
                temp=temp/10;
            }
            if(count>0)
            {
                System.out.println(i+"\t"+count);
            }
        }
    }
}