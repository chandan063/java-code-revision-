public class setGet{
    public static void main(String args[]){
        pen p1=new pen();//created a pen object called p1;
        p1.setTip(5);
        p1.setColor("red");
        System.out.println(p1.getTip());
        System.out.println(p1.getColor());

        p1.setColor("yellow");
        System.err.println(p1.getColor());
        
    }

}
class pen{
   private String color;
    private int tip;

    String getColor(){
        return this.color;
    }
    
    int getTip(){
        return this.tip;
    }

    void setColor(String newColor){
        this.color=newColor;
    }

    void setTip(int tip){ // here int tip shows external variable
        this.tip=tip;//this.tip represent the upper variable
    }
}