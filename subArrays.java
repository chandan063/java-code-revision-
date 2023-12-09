public class Program
{
     public static void subArraysPrint(int a[]){
         for(int i=0;i<a.length;i++){
             for(int j=i;j<a.length;j++){
                 for(int k=i;k<=j;k++){
                         System.out.print(a[k]+" ");
                 }
                  System.out.println();
             }
             System.out.println();
         }
     }

    public static void main(String[] args) {
		int ar[]={1,2,3,4,5};
          subArraysPrint(ar);
	}
}
// OUTPUT
/*
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 

2 
2 3 
2 3 4 
2 3 4 5 

3 
3 4 
3 4 5 

4 
4 5 

5 

*/
