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
    
    public static void main(String[] args) {
		int a[]={22,55,56,57,88};
        int key=10;
        pairs(a);
        
	}
    
}


// output
/*
[22,55][22,56][22,57][22,88]
[55,56][55,57][55,88]
[56,57][56,88]
[57,88]

total no of pairs are:10
  */
