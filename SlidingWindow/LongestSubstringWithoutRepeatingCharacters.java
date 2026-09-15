class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int i = 0, j = 0;
        HashSet<Character> set = new HashSet<>();
        while (j < s.length()) {
            char ch = s.charAt(j);
            if (!set.contains(ch)) {
                set.add(ch);
                max = Math.max(max, j - i + 1);
                j++;
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }
}