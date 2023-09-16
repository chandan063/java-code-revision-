// import java.util.*;

public class stringArray {

    public static int linearSearch(String iteams[],String key){
        for(int i=0;i<iteams.length;i++){
            if(iteams[i]==key){
                return i;
            }
        }
        return -1; //we use -1 if we dont't found the desired value which we are looking for
    }

    public static void main(String[] args){
        String iteams[]={"dosa","panner","samosa","liiti","idly","coffee"};
        // int key=65; //for the value that exists
        String key1="coffee"; //for value that does't exits
        int index=linearSearch(iteams,key1);
        if(index==-1){
            System.out.println("Not Found");
        }
        else System.out.println("Key found at:"+index);
    }
}

