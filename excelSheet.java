/*
Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...
 

Example 1:

Input: columnNumber = 1
Output: "A"
Example 2:

Input: columnNumber = 28
Output: "AB"
Example 3:

Input: columnNumber = 701
Output: "ZY"

*/

//code for the above

public class Program
{
   
    public static String convertToTitle(int columnNumber) {
       StringBuilder sb=new StringBuilder();
       while(columnNumber>0){
           int value=(columnNumber-1)%26;
           sb.append(Character.toString((char)(65+value)));
           columnNumber=(columnNumber-1)/26;
       }
       return sb.reverse().toString();
    }

    public static void main(String[] args) {
		int a=30;
        System.out.println(convertToTitle(a));

	}
}
// output == AD
