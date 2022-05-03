

class Example extends Thread {

 public void run(){
for(int i=1;i<=15;i++){
try{
Thread.sleep(1000);
}
catch(Exception e){
System.out.println(e);
}
System.out.println("Child Thread");
}
}

 public static void main(String args[]){
Example obj=new Example(); // new/Born
obj.start();
for(int i=1;i<=15;i++){
try{
Thread.sleep(2000);
}
catch(Exception e){
System.out.println(e);
}
System.out.println("Main Thread");
}
}
}