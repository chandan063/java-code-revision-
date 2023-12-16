import java.util.*;
public class Program
{
     public static boolean search(int ma[][],int key,int n,int m){
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(ma[i][j]==key){
                System.out.println("found at index "+i+" and "+j);
                return  true;
                }
            }
        }
        System.out.println("not found");
        return false;
    }
    public static void print(int ma[][],int n,int m){
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(ma[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int matrix[][]=new int[3][3];
        int n=matrix.length,m=matrix[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
             matrix[i][j]=sc.nextInt();
            }
        }
       
        print(matrix,n,m);
        search(matrix,88,3,3);

	}
}
/*

output

1 2 3 
4 5 6 
7 8 9 
not found
*/
