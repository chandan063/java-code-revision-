public class Program
{
    public static void pairs(int a[]){
        int count=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                System.out.print("["+a[i]+","+a[j]+"]");
                  count++;
            }
            System.out.println();
          
        }
        System.out.println("total no of pairs are:"+count);
    }
    public static int removeDuplicate(int a[]){
        if(a.length==0){return 0;}
        int k=0;
        for(int i=1;i<a.length;i++){
            if(a[i]!=a[i-1]){
                a[k]=a[i];
                k++;
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        return k;
    }
    public static void main(String[] args) {
		int a1[]={22,55,56,57,88};
        int a[]={1,1,1,3,4,4,5,6,6,6,6};
        int key=10;
        pairs(a1);
        System.out.println(removeDuplicate(a));
	}
    
}


// output
/*
[22,55][22,56][22,57][22,88]
[55,56][55,57][55,88]
[56,57][56,88]
[57,88]

total no of pairs are:10

3 4 5 6 4 4 5 6 6 6 6 
4
  */
