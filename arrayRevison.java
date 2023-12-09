public class Program
{
    public static void update(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]+2;
        }
    }
    public static void print(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static int largest(int a[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;

        for(int i=0;i<a.length;i++){
            if(largest<a[i]){
                largest=a[i];
            }
            if(smallest>a[i]){
                smallest=a[i];
            }
        }
       System.out.println("smallest value is :"+smallest);

        return largest;
    }
    public static void main(String[] args) {
		int a[]={44,33,54,43,32};
        // update(a);
        print(a);
        System.out.println("largest value is :"+largest(a));
	}
}
