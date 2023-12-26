//sum of the primarydiagonal(pd) and secondary diagonal(sd)
public class Program
{
    public static int diagonalSum(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==j){
                    sum+=matrix[i][j];
                }
                else if(i+j==matrix.length-1){
                    sum+=matrix[i][j];
                }
            }
        }
        return sum;
    }
    public static int diagSum(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            //pd
            sum+=matrix[i][i];
            //sd
            if(i!=matrix.length-1-i){
                sum+=matrix[i][matrix.length-i-1];
            }
        }
        return sum;
    }
   
   public static void prints(int ar[][]){
       for(int i=0;i<ar.length;i++){
           for(int j=0;j<ar.length;j++){
               System.out.print(ar[i][j]+" ");
           }
           System.out.println();
       }
   }

    public static void main(String[] args) {
		int marks[][]={{1,2,3},{4,5,6},{7,8,9}};
        prints(marks);
         System.out.println();
        System.out.println(diagonalSum(marks));
        System.out.println(diagSum(marks));
	}
}

/*

1 2 3 
4 5 6 
7 8 9 

25
25

*/
