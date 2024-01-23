import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(99);
        a.add(88);
        a.add(89);
        a.add(77);
        a.add(55);
        System.out.println("size of ArrayList is: "+a.size());
//        for printing using loop
        for(int i=0;i<a.size();i++){
            System.out.print(a.get(i)+" ");
        }
        System.out.println();
//        printing the reverse
        //        for printing using loop
        for(int i=a.size()-1;i>=0;i--){
            System.out.print(a.get(i)+" ");
        }
        System.out.println();
//finding max
//        Collections.sort(a);
//        System.out.println("largest number is: "+a.get(a.size()-1));
        int max= Integer.MIN_VALUE;
        for(int i=0;i<a.size();i++){
//            if(max<a.get(i)){
//                max=a.get(i);
//            }
            max=Math.max(max,a.get(i));//we can use this also or the above if conditon also
        }
        System.out.println(max);
    }
}
