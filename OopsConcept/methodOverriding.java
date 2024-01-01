// comes under runtime polymorphism

public class methodOverloading{
    public static void main(String[] args){
        dog d=new dog();
        d.eat();
    }
}
class animal{
    void eat(){
        System.out.println("eat anything");
    }
}
class  dog extends animal{
    void eat(){
        System.out.println("eat bones");
    }
}