public class heraricalLevel{
    public static void main(String []args){
        System.out.println("Fish class");
        fish f1=new fish();
        f1.eats();
        f1.swim();
        System.out.println();

        System.out.println("Dog class");
        dog d=new dog();
        d.breath();
        d.bark();
        System.out.println();
        
        System.out.println("Mammals class");
        mammals m1=new mammals();
        m1.eats();
        m1.breath();
        m1.walk();
    }
}
class animals{
    String color;

    void eats(){
        System.out.println("eating...");
    }
    void breath(){
        System.out.println("saans le raha hai..");
    }
}
class fish extends animals{
    void swim(){
        System.out.println("fish is swimming..");
    }
}

class dog extends animals{
    void bark(){
        System.out.println("dog is barking");
    }
}
class mammals extends animals{
    void walk(){
        System.out.println("mammals walks ..");
    }
}