// using recursion
import java.util.*;
public class Program
{
    public static void main(String[] args) {
        int h=38;
        int finals=addDigit(h);
        System.out.println(finals);
		
	}
    public static int addDigit(int num){
        int sum=0;
        if(num<10){
            return num;
        }
        else{
            while(num>0){
                sum+=num%10;
                num/=10;
            }
        }
        return addDigit(sum);
    }
}



// using mathematical Digital root


    public static int findDigitalRoot(int num) {
        if (num == 0) {
            return 0;
        }
        return 1 + ((num - 1) % 9);
    }
}
/*
input-38
output=2;
  */
