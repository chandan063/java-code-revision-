import java.util.*;
public class Program
{
  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sb=sc.nextLine();
	  String s[]=sb.split(" ")	;
      String reverse="";
      for(int i=s.length-1;i>=0;i--){
          reverse+=s[i]+" ";
      }
      System.out.println(reverse.substring(0, reverse.length()-1));
      
	}
}

/*
input=my name is ram kumar verma
output= verma kumar ram is name my

*/
