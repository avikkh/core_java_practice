//  WAP to print no.of digits, no.of alphabets and number of special characters.
class String1{

  public static void main(String args[]){

    String str="hi hello @#& 12378 bitlabs";
    int dcount=0,acount=0,scount=0;
    for(int i=0;i<str.length();i++){

      if(str.charAt(i)>='0' && str.charAt(i)<='9'){
        dcount++;
      }
      else if(str.charAt(i)>='A' && str.charAt(i)<='Z' || str.charAt(i)>='a' && str.charAt(i)<='z'  ){
        acount++;
      }
      else if(str.charAt(i)!=' '){
        scount++;
      }
    }
    System.out.println("Number of digits: "+dcount);
    System.out.println("Number of alphabets: "+acount);
    System.out.println("Number of Special characters: "+scount);
    

  }
}