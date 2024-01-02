import java.util.*;

public class Statics{
    public static void main(String []args){
        student s1=new student();
        s1.schoolName="cambridge";
        //if we change the static declared variable then it will change it for all object created;
        student s2=new student();
        System.out.println(s2.schoolName);///this will print cmabridge even s2 is not declared its schoolname;

        student s3=new student();
        s3.schoolName="mandir";//if we change here means it will change for all s1,s2,s3
        System.err.println(s3.schoolName);//mandir
        System.err.println(s1.schoolName);//mandir
        System.err.println(s2.schoolName);//mandir
    }
}
class student{
    String name;
    int roll;

    static String schoolName;

    void getName(String name){
        this.name=name;
    }

    String setName(){
        return this.name;
    }
}