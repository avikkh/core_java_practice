
//  WAP to print reverse of words in a given string.
class String4{

  public static void main(String args[]){

   String str="welcome to bitLabs";

    String words[]=str.split(" ");
   
    

    for(int i=words.length-1;i>=0;i--){
      System.out.print(words[i]+" ");
      }
    }
    
  }