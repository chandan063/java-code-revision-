public class abstractClass{
    public static void main(String []args){
        horse h=new horse();
        chicken c=new chicken();

        h.eat();
        h.walk();
        // System.out.println(h.color); will print brown as default
        System.out.println(h.color);
        c.eat();
        c.walk();

        // animal a1=new animal();  can xreate object as it is abstract class

       
    }
}
// abstract funtion
abstract class animal{
        String color;
    // constructors in abstract 
     animal(){
        color="brown";//it will give a default color to all animal until changed
     }
    // non-abstract method below
     void eat(){
        System.out.println("animals eating");//implmentation
     }
     // abstract methdd
     abstract void walk();//no implementation further 
     // it's only give the idea that there should be an walk method and as per use in other classe implement it.
}
class horse extends animal{
     horse(){
        color="black";//default color is changed to black;
     }
    
    void walk(){
        System.out.println("walks on 4legs");
    }
}
class chicken extends animal{
    void  walk(){
        System.out.println("walks on 2 legs");
    }
}