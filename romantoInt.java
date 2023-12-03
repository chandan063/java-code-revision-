class Solution {
    public int romanToInt(String s) {
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == 'I') {
                if (i + 1 < s.length() && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')) {
                    num -= 1;
                } else {
                    num += 1;
                }
            } else if (ch == 'V') {
                num += 5;
            } else if (ch == 'X') {
                if (i + 1 < s.length() && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) {
                    num -= 10;
                } else {
                    num += 10;
                }
            } else if (ch == 'L') {
                num += 50;
            } else if (ch == 'C') {
                if (i + 1 < s.length() && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) {
                    num -= 100;
                } else {
                    num += 100;
                }
            } else if (ch == 'D') {
                num += 500;
            } else if (ch == 'M') {
                num += 1000;
            }
        }
        return num;
    }
}
