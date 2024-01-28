import java.util.*;
import java.util.ArrayList;
class check{

    public static void reverse(ArrayList<Integer> list){
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
    }


    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> a=new ArrayList<>();
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            a.add(sc.nextInt());
        }
        reverse(a);
    }
}