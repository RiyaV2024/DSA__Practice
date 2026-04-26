
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == i + 1) {
                i++;
            } else {
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
                if (nums[i] == nums[temp - 1])
                    i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1)
                ans.add(j + 1);
        }

        return ans;
    }
}
