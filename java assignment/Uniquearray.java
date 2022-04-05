//WAP to print unique elements in an array.

// main class
class Uniquearray{
// main method
public static void main(String[] args)
{
int arr[] = {3,7,5,5,7,9,9,3}; // unique = 3, 7, 5
int index = 0;
int[] unique = new int[7];

 for(int i = 0; i < 7; i++)
{
int temp = 0;
for(int j = 0; j < i; j++)
{
if(arr[i] == arr[j])
{
temp = 1;
break;
}
}
if(temp == 0)
{
unique[index] = arr[i];
index++;
}
}

 for(int k = 0; k < index; k++)
{
System.out.print(unique[k]+ ", ");
}
}
}