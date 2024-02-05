import java.util.*;

public class LL3{
    public static void main(String args[]){
        LinkedList<Integer> list=new LinkedList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        System.out.println(list.size());
        System.out.println("list:"+list);
        System.out.println("First remove:"+list.remove());
        System.out.println("list:"+list);
        System.out.println(list.size());
        list.add(1);
        list.add(9);
        System.out.println(list);
        System.out.println("last remove:"+list.removeLast());
        System.out.println(list);
    }
}