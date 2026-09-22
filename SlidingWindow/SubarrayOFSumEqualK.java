class Solution {
    public int subarraySum(int[] arr, int k) {
        int i = 0;
        int j = 0;
        int sum = 0;
        int maxLen = 0;
        while (j < arr.length) {
            sum += arr[j];
            while (sum > k) {
                sum -= arr[i];
                i++;
            }
            if (sum == k) {
                maxLen = Math.max(maxLen, j - i + 1);
            }
            j++;
        }
        return maxLen;
    }
}