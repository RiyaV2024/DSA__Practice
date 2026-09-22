class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        int m = t.length();
        int[] hash = new int[256];
        int l = 0;
        int r = 0;
        int minLen = Integer.MAX_VALUE;
        int start = -1;
        int cnt = 0;
        for (int i = 0; i < m; i++) {
            hash[t.charAt(i)]++;
        }
        while (r < n) {
            if (hash[s.charAt(r)] > 0) {
                cnt++;
            }
            hash[s.charAt(r)]--;
            while (cnt == m) {
                if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    start = l;
                }
                hash[s.charAt(l)]++;
                if (hash[s.charAt(l)] > 0) {
                    cnt--;
                }
                l++;
            }
            r++;
        }
        if (start == -1) {
            return "";
        }

        return s.substring(start, start + minLen);
    }
}