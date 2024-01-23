import java.util.ArrayList;
import java.util.Collections;

public class Demo3 {
//23-jan-2024

    //        swapping the two numbers
    public static void swappin(ArrayList<Integer> a,int index1,int index2){
        int temp=a.get(index1);
        a.set(index1,a.get(index2));
        a.set(index2,temp);
    }

    public static void main(String []args){
        ArrayList<Integer> a=new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(5);
        a.add(6);
        a.add(9);
        System.out.println(a);

        int index1=1,index2=3;
        swappin(a,index1,index2);
        System.out.println(a);
//        for sorting we use Collections.sort(list);
        Collections.sort(a);
        System.out.println("after sorting: "+a);
//        for descending order
        Collections.sort(a,Collections.reverseOrder());
        System.out.println("reverse "+a);

    }
}
