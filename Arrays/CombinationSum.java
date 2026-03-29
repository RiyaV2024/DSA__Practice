class Solution {
    void solve(List<List<Integer>> ans, List<Integer> cur, int[] nums, int i, int target) {
        if (target < 0)
            return;
        if (target == 0) {
            ans.add(new ArrayList<>(cur));
            return;
        }
        for (int j = i; j < nums.length; j++) {
            cur.add(nums[j]);
            solve(ans, cur, nums, j, target - nums[j]);
            cur.remove(cur.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        solve(ans, cur, nums, 0, target);
        return ans;
    }
}