package String;

class Solution {
    public int compress(char[] chars) {
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            char current = chars[i];
            int count = 1;
            while (i + 1 < chars.length && chars[i + 1] == chars[i]) {
                count++;
                i++;
            }
            chars[index++] = current;
            if (count > 1) {
                String str = String.valueOf(count);
                for (char ch : str.toCharArray()) {
                    chars[index++] = ch;
                }
            }
        }
        return index;
    }
}