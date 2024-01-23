
import java.util.ArrayList;
//22-jan-2024
public class Demo1 {
    public static void main(String []ags){
        ArrayList<Integer> a=new ArrayList<>();
//        Operations
//        add O(1)
        a.add(1);
        a.add(2);
        a.add(4);
        a.add(5);
        a.add(9);
        a.add(5,12);//we can add at by giving index also
        System.out.println(a);

//        get operation O(1)
        int element=a.get(2);
        System.out.println(element);

//        Delete operation
        a.remove(2);
        System.out.println("After removing operation: "+a);

//        set operation
        a.set(2,10);
        System.out.println("Output after set operation: "+a);
//        contains operaton
        System.out.println(a.contains(1));
        System.out.println(a.contains(11));
    }
}
