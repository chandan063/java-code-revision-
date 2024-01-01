import java.util.*;
public class inheritance{
    public static void main(String []args){
        dog d1=new dog();
        d1.eat();
        d1.breath();
        d1.bark();
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
class dog extends animals{
    int legs;

    void bark(){
        System.out.println("dogs is barking.....");
    }
}