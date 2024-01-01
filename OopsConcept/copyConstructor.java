public class copyConstructor{
    public static void main(String []args){
        student s1=new student();
        s1.name="ram";
        s1.roll=123;
        s1.password="abcd";
        s1.marks[0]=100;
        s1.marks[1]=30;
        s1.marks[2]=60;
        //for creating new variable and bringing the properties of s1 object we use copyconstructor
        student s2=new student(s1);
        s2.password="vkas";
        s1.marks[2]=6;
        // System.out.println(s2.name);
        // System.out.println(s2.roll);
        // System.out.println(s2.password);
        // System.out.println("s1 password: "+s1.password);
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }


    }
}
class student{
    String name;
    int roll;
    String password;
    int marks[];

    //for copying we create a constructor 
    //copy construtor
    student(student s1){
        marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        this.marks=s1.marks;
    }

    student(){
         marks=new int[3];
        System.out.println("constructor called...");
    }
    student(String name){
         marks=new int[3];
        this.name=name;
    }
    student(int roll){
         marks=new int[3];
        this.roll=roll;

    }
}