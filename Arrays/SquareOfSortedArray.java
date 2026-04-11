public class SquareOfSortedArray {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int start = 0;
        int last = n - 1;
        int k = n - 1;
        while (start <= last) {
            int leftVal = nums[start];
            int rightVal = nums[last];
            if (leftVal * leftVal > rightVal * rightVal) {
                ans[k] = leftVal * leftVal;
                start++;
            } else {
                ans[k] = rightVal * rightVal;
                last--;
            }
            k--;
        }
        return ans;
    }
}
