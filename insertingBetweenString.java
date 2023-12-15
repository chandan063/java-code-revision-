import java.util.*;
public class Program
{
    public static String original(String arg){
        char ch='-';
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<arg.length();i++){
            sb.append(arg.charAt(i));

            if(i!=arg.length()-1){
                sb.append(ch);
            }
        }
        String finalString=sb.toString();
        return finalString;
    }
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        System.out.println("Before: "+st);
        System.out.println("After: "+original(st));
	}
}
/*
output
Before: 123456789
After: 1-2-3-4-5-6-7-8-9

*/
