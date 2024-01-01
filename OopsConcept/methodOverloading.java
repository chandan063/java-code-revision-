public class methodOverloading{
    public static void main(String []args){
        calculator ca=new calculator();

        System.out.println(ca.sum(3,4));

        System.out.println(ca.sum((float)1.5,(float)2.5));

        System.out.println(ca.sum(3,4,3));
    }
}
class calculator{
    int sum(int a ,int b){
        return a+b;
    }

    float sum(float a,float b){
        return a+b;
    }

    int sum(int a ,int b, int c){
        return a+b+c;
    }
}