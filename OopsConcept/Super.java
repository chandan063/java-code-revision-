public class Super{
    public static void main(String []args){
        Horse h1=new Horse();
        //see the change in color with super,color
        System.err.println(h1.color);
    }
}
class Animal{
    String color;
    Animal(){
        System.err.println("animal construtor called...");
    }
}
class Horse extends Animal{
   
    Horse(){
       // super();//this will call the parent class constructor first.
       super.color="red";//here with super we are intializing color to red.
        System.err.println("horse constructor called...");
      
    }
}