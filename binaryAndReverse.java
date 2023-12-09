public class Program
{
    public static int binarySearch(int []arr,int key){
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;

            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){
                start=mid+1;
            }
            else {end=mid-1;}
        }
        return -1;
    }
    public static void reverse(int a[]){
       int first=0,last=a.length-1;
       while(first<last){
            int temp=a[last];
            a[last]=a[first];
            a[first]=temp;
            last--;
            first++;
            
       }
       for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");      
        }
        System.out.println();
    }

    public static void main(String[] args) {
		int a[]={22,55,56,57};
        int key=10;
        System.out.println(binarySearch(a,key));
        reverse(a);
        
	}
    
}
