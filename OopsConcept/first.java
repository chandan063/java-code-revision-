public class first{
    public static void main(String args[]){
        pen p1=new pen();//created a pen object called p1;
        p1.setTip(5);
        p1.setColor("red");
        System.out.println(p1.tip);
        System.out.println(p1.color);
        p1.color="green";
        System.out.println(p1.color);


    }

}
class pen{
    String color;
    int tip;

    void setColor(String newColor){
        color=newColor;
    }

    void setTip(int newTip){
        tip=newTip;
    }
}

class student{
    String name;
    int age;
    float percentage;

    void calPercentage(int phy,int chem,int math){
        percentage=(phy+chem+math)/300;
    }


}