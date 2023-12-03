// for a given string convert each of the first letter of each word to uppercase

import java.util.*;
public class Program
{
    public static String compare(String str){
        StringBuilder sb=new StringBuilder("");
        char a=Character.toUpperCase(str.charAt(0));
        sb.append(a);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else {
                sb.append(str.charAt(i));
            }
        }
        return (sb.toString());
    }
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        // compare(str);
        System.out.println(compare(str));
	}
}
