import java.util.*;
class Demo8{

    public static void main(String []args){
        ArrayList<Integer> a=new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        System.out.println(a);
        int count=0;
//        for adding all the sum of even number in arraylist
        for(int i=0;i<a.size();i++){
            if(a.get(i)%2==0){
                count+=a.get(i);
            }
        }
        System.out.println("Sum of Even Number in ArrayList are: "+count);
    }
}