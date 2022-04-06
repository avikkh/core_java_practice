// WAP to print largest word in a given string.
class Example{

 public static void main(String args[]){

 String str="welcome123 to bitLabs hi helloksjhksda";
int max=0;
String largest_word=null;
String words[]=str.split(" ");

 for(int i=0;i<words.length;i++){
if(max<words[i].length())
{
max=words[i].length();
largest_word=words[i];
} }

 System.out.println("Largest word: "+largest_word);
}
}

// WAP to print frequency of each word in a given string.
class String7{

 public static void main(String args[]){

 String str="welcome to bitLabs hi welcome hi";

 String words[]=str.split(" ");
int count=1;
for(int i=0;i<words.length;i++){

 for(int j=i+1;j<words.length;j++){
if(words[i].equals(words[j])){
count++;
words[j]=" ";
}
}
if(!words[i].equals(" ")){
System.out.println(words[i]+" : "+count);
}
count=1;
}
}
}