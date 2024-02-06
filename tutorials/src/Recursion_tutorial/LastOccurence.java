package Recursion_tutorial;

public class LastOccurence {
    public static int last(int arr[],int key,int i){
        if(i == arr.length){
            return -1;
        }
        int found=last(arr,key,i+1);
        if(found == -1 && arr[i] == key) {
            return i;
        }
        return found;
    }

    public static void main(String args[]){
        int a[]={8,3,6,9,5,10,2,5,3};// O/P-7
        int b[]={5,5,5,5,5,5};// O/P=5
        int key=5,i=0;
        System.out.println(last(b,key,i));
    }
}
