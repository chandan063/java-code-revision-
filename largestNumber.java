
public class largestNumber {
    public static int big(int []number,int large){
        large=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
           if(number[i]>large){
            large=number[i];
           }
          
        }
         return large;
    }
    public static void main(String []args){
        int number[]={33,12,44,67,22};
        int large=Integer.MAX_VALUE;//signify minus infinity inside java
        int largestNumber= big(number,large);
        System.out.println("biggest value in arrray is:"+largestNumber);

    }
}
