public class constructor{

    public static void main(String []args){
        student s1=new student();
        student s2=new student("ram");
        student s3=new student(34);
        System.out.println(s2.name);
        System.out.println(s3.roll);
    }
}
class student{
    String name;
    int roll;

    student(){//also called parameterized constructor
    // System.out.println();
        // this.name=name;
        System.out.println("constructor is called.....");
    }

    student(String name){//parameterized constructor
        this.name=name;
    }

    student(int roll){
        this.roll=roll;
    }
}