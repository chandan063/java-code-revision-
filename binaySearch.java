import java.util.Arrays;
public class binaySearch{

    //binary search
    public static int search(int[] number,int key){
        int start=0, end=number.length-1;
        while(start<=end){
          int mid=(start+end)/2;

          //comparison 
          if(number[mid]==key){
            return mid;
          }
          if(number[mid]<key){
            start=mid+1;
          }
          else end=mid-1;
        }
        return -1;
    }

    public static void main(String[] args){
        // int number[]={2,44,1,23,42,52,25,21};
        int number[]={2,4,6,8,12,24};
        Arrays.sort(number);
        for(int i=0;i<number.length;i++){
            System.out.print(number[i]+",");
        }
        System.out.println("");
        int key=12;
        System.out.println(search(number,key));
    }
}