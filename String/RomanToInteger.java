class Solution {
    public int romanToInt(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            int val = value(s.charAt(i));
            if ((i + 1) < s.length() && val < value(s.charAt(i + 1)))
                ans -= val;
            else
                ans += val;
        }
        return ans;
    }

    static int value(char ch) {
        return switch (ch) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}