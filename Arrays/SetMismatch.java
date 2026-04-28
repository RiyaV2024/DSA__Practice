
class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == i + 1)
                i++;
            else {
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
                if (nums[i] == nums[temp - 1]) {
                    ans[0] = nums[i];
                    i++;
                }
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                ans[1] = j + 1;
            }
        }
        return ans;
    }
}