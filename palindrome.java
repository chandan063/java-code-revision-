// palinf=drome and strig manupulation both 
public class Program
{
   public void printNumbers(String str){
       for(int i=0;i<str.length();i++){
           System.out.print(str.charAt(i)+" ");
       }
       System.out.println();
   }
  public static boolean isPalindrome(String str){
      
      for(int i=0;i<str.length()/2;i++){
          int n=str.length();
          if(str.charAt(i)!=str.charAt(n-1-i)) {
              return false;
            }
      
        }
        return true;
    }

    public static void main(String[] args) {
		String first_name="chandan";
        String last_name="kumar";
        String complete=first_name+" "+last_name;
        String word="lool";
        System.out.println(complete);

        Program onj=new Program();

        onj.printNumbers(complete);
    
        System.out.println(isPalindrome(last_name));
	}
}
