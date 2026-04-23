
class Solution {
    public int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == i + 1)
                i++;
            else {
                int t = nums[i];
                nums[i] = nums[t - 1];
                nums[t - 1] = t;
                if (nums[i] == nums[t - 1])
                    return nums[i];
            }
        }
        return nums[i];
    }
}