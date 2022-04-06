class String6{
  public static void main(String[] args)
  {
    String str="Wel to bitLabs hhhh";
    String words[]=str.split(" ");
    String current;
    String largest;
    largest=words[0];
   for(int i=0;i<words.length;i++)
     {
       current=words[i];
       if(current.length() >largest.length()){
         largest=current;
       }
     }
     
    
			
       System.out.println( "The largestin each word is " +largest);

  
   	
   // System.out.println( "The alphabets in each word is " +count);
}
}