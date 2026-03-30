class Solution {
    public int maxArea(int[] height) {
        int maxAns = 0;
        int lp = 0;
        int rp = height.length - 1;
        while (lp < rp) {
            int width = rp - lp;
            int h = Math.min(height[lp], height[rp]);
            int currWater = width * h;
            maxAns = Math.max(maxAns, currWater);
            if (height[lp] < height[rp]) {
                lp++;
            } else {
                rp--;
            }

        }
        return maxAns;
    }
}