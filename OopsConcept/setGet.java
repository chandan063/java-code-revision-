public class first{
    public static void main(String args[]){
        pen p1=new pen();//created a pen object called p1;
        p1.setTip(5);
        p1.setColor("red");
        System.out.println(p1.getTip());
        System.out.println(p1.getColor());
        p1.color="green";
        System.out.println(p1.getColor());


    }

}
class pen{
    protected String color;
    protected int tip;

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    void setColor(String newColor){
        this.color=newColor;
    }

    void setTip(int tip){
        this.tip=tip;
    }
}