

// WAP to print number of alphabets in each word.
class String8{

 public static void main(String args[]){

 String str="welcome123 to bitLabs hi hello";

 String words[]=str.split(" ");
int count=0;
for(int i=0;i<words.length;i++){
  
for(int j=0;j<words[i].length();j++)
{
if(words[i].charAt(j)>='A' && words[i].charAt(j)<='Z' || words[i].charAt(j)>='a' && words[i].charAt(j)<='z'){
count++;
}
}

 System.out.println(words[i]+" : "+count);
count=0;
}
}
}
