public class smallesNumber {
    public static int smallest(int[] number){
        int small=Integer.MAX_VALUE;//use this significane for minus infinity
        for(int i=0;i<number.length;i++){
            if(number[i]<small){
                small=number[i];
            }
        }
        return small;
    }
    public static void main(String[] args){
        int []number={33,22,3,44,1,54,35};
        System.out.println("Smallest value in the given array: "+smallest(number));
    }
}
