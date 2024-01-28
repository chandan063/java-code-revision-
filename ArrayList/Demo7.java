import java.util.*;

public class Demo7{
//find if any pair in a sorted arraylist has a target sum;

//    using brute force method
    public static boolean pairSum1(ArrayList<Integer> list,int target){
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j)==target){
                    return true;
                }
            }
        }
        return false;
    }
//    using 2pointer approach
    public static boolean pairsSum(ArrayList<Integer> list,int target){
        int lp=0,rp=list.size()-1;
        while (lp!=rp) {
//            case-1
            int currTotal = list.get(lp) + list.get(rp);
            if (currTotal == target) {
                return true;
            }
//            case-2
            if (currTotal < target) {
                lp++;
            }
//            case-3
            else {
                rp--;
            }
        }
        return false;
    }
    public static void main(String []args){
        ArrayList<Integer> a=new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        int target=5;
        System.out.println(pairSum1(a,target));
        System.out.println(pairsSum(a,target));
    }
}