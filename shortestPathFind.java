// HERE WE FIND THE SHORTEST PATH FOR THE GIVEN DIRECTION WITH STRING
import java.util.*;
import java.lang.Math.*;
public class Program
{
    public static float findShortestPath(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char direction=path.charAt(i);
            if(direction =='n'){y++;}
            if(direction =='s'){y--;}
            if(direction =='e'){x++;}
            else {x--;}
        }
         int squareOfX=x*x;
            int squareOfY=y*y;
        return (float)Math.sqrt(squareOfX+squareOfY);
    }
    
    public static void main(String[] args) {
		String path="wneenesennn";
        System.out.println(findShortestPath(path));

	}
}
