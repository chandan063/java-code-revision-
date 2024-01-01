public class hybrid{
    public static void main(String []args){
        System.out.println("humans");
        human h=new human();
        h.eats();
        h.breath();
        h.walk();
        h.speak();
        
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
class human extends mammals{
    void speak(){
        System.out.println("humans are speaking");
    }
}