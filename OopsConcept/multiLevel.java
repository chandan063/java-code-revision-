import java.util.*;
public class inheritance{
    public static void main(String []args){
        dog d1=new dog();
        d1.eat();
        d1.breath();
        d1.bark();
        d1.legs=4;
        System.out.println("dogs have "+d1.legs+" legs");
    }
}
//base class
class animals{
    String color;
    void eat(){
        System.out.println("animals eats..");
    }
    void breath(){
        System.out.println("animals breath..");
    }
}
//derived class or child class
 class mammals extends animals{
    int legs;
    
 }



//derived class or child class
class dog extends mammals{
    int bread;

    void bark(){
        System.out.println("dogs is barking.....");
    }
}