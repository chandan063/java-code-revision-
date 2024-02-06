import java.util.*;
//discussion on old time and date methods
class second{
    public static void main(String []args){
//        creating an object of date
        Date d=new Date();
//        if we pass the argument system.currentTimeMillis() then also it will give same result
        Date y=new Date(System.currentTimeMillis());
//        System.out.println(d);//it will give the today's date and time
//        System.out.println("after passing arg : "+y);

//        Date n=new Date("2/5/2023"); //if we pass any date in string form ,we get day and time of that args
//        System.out.println(n.getDay());
        System.out.println(d.getTime()+" time in  miliseconds");
        System.out.println("Date is : "+d.getDate());
        System.out.println("Day is : "+d.getDay());//it will give day of the week like mon-1,tue-2
        System.out.println(d.getYear()+1900);//method will give only yeat after 1900 so get exact year we have to add 1900
    }
}