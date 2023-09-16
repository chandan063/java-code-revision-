import java.util.*;
public class linearArray{
    public static int linearSearch(int number[],int key){
        for(int i=0;i<number.length;i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1; //we use -1 if we dont't found the desired value which we are looking for
    }

    public static void main(String[] args){
        int number[]={22,33,45,65,12,1,33};
        // int key=65; //for the value that exists
        int key1=99; //for value that does't exits
        int index=linearSearch(number,key1);
        if(index==-1){
            System.out.println("Not Found");
        }
        else System.out.println("Key found at:"+index);
    }
}