import java.util.ArrayList;

public class Demo6 {
//Brute force method
    public static int StoreWater(ArrayList<Integer> height){
        int maxWater=0;
//        applying brute force TC=O(n^2)
        for (int i=0;i<height.size();i++){
            for (int j=i+1;j<height.size();j++){
                int ht=Math.min(height.get(i), height.get(j));
                int width=j-i;
                int currWater=ht*width;
                maxWater=Math.max(maxWater,currWater);
            }
        }
        return maxWater;
    }

//    Using two pointer Approach  TC=O(n)
    public static int storeWater(ArrayList<Integer> height){
        int maxWater=0;
        int lp=0,rp=height.size()-1;
        while(lp<rp){
//            calculate the area
            int ht=Math.min(height.get(lp),height.get(rp));
            int width=rp-lp;
            int currWater=ht*width;
            maxWater=Math.max(maxWater,currWater);

//            update the pointer
            if(height.get(lp)<height.get(rp)){
                lp++;
            } else{
                rp--;
            }

        }
        return maxWater;
    }

    public static void main(String []args){
        ArrayList<Integer> height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println("water using brute force: "+StoreWater(height));
        System.out.println("water using 2pointer approach : "+storeWater(height));

    }
}
