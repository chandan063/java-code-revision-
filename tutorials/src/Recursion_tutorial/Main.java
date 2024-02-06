package Recursion_tutorial;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        int arr[]={1,2,3,7,5};
//        printDec(10);
//        printInc(5);
//        System.out.println(fact(5));
//        System.out.println(sumOf(5));
//        System.out.println(fibo(5));
        System.out.println(isSorted(arr,0));
    }


    public static void printDec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n - 1);
    }

    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(n);
            return;
        }
        printInc(n-1);
        System.out.print(" "+ n);
    }

    //factorial of a number
    public static int fact(int n){
        if(n==0){
            return 1;
        }
         int fnm1=fact(n-1);
        int fn=n*fact(n-1);
        return fn;

    }

//    sum of first n natural numbers
    public static int sumOf(int n){
        if(n==1){
            return 1;
        }
        int sm1=sumOf(n-1);
        int s=n+sumOf(n-1);
        return s;
    }
//    print nth term Fibonacci series
    public static int fibo(int n){
        if(n==0 || n==1){
            return n;
        }

        int fibnm1=fibo(n-1);
        int fibnm2=fibo(n-2);
        int fibn=fibnm1+fibnm2;
        return fibn;
    }


// check Weather the given array is sorted or not

    public static boolean isSorted(int arr[],int i){
      if(i==arr.length-1){
        return true;
    }
      if(arr[i]>arr[i+1]){
          return false;
      }
      return isSorted(arr,i+1);
     }
}

