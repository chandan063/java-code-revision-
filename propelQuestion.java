import java.util.*;

public class Main {

    // __define-ocg__
    public static String ArrayChallenge(String[] strArr) {
        String sequence = strArr[0];
        String[] dictionary = strArr[1].split(",");

        for (int i = 1; i < sequence.length(); i++) {
            String first = sequence.substring(0, i);
            String second = sequence.substring(i);

            if (isWord(first, dictionary) && isWord(second, dictionary)) {
                return first + "," + second;
            }
        }

        return "not possible";
    }

    public static boolean isWord(String word, String[] dictionary) {
        for (String dictWord : dictionary) {
            if (word.equals(dictWord)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] input1 = {"baseball", "a,all,b,ball,bas,base,cat,code,d,e,quit,z"};
        String[] input2 = {"abcgefd", "a,ab,abc,abcg,b,c,dog,e,efd,zzzz"};

        String output1 = ArrayChallenge(input1);
        String output2 = ArrayChallenge(input2);

        StringBuilder result1 = new StringBuilder(output1);
        StringBuilder result2 = new StringBuilder(output2);

        String challengeToken = "chpl0617";

        result1.reverse();
        result2.reverse();
        challengeToken = new StringBuilder(challengeToken).reverse().toString();

        String finalOutput1 = result1 + ":" + challengeToken;
        String finalOutput2 = result2 + ":" + challengeToken;

        System.out.println("Final Output 1: " + finalOutput1);
        System.out.println("Final Output 2: " + finalOutput2);
    }
}

/*

Final Output 1: llab,esab:7160lphc
Final Output 2: dfe,gcba:7160lphc

*/
