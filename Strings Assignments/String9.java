//WAP to print largest word in a given string.
class String9{

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
