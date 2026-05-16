
class Solution {
    public int findMin(int[] nums) {
        int n = nums.length ;
        int low =  0;
        int high =  n - 1;
        int result =0;
        while(low <= high){
        while(low < high && nums[low]==nums[low + 1]) low ++;
        while( high > low && nums[ high]==nums[ high - 1]) high --;        
         int mid = low + ( high - low) / 2;
         if(nums[mid]< nums[result]){
            result = mid ;
         }
        if(nums[mid]> nums[ high]){
           low= mid + 1 ;   
        }
        else{
            high = mid  - 1;
        }


        } 
        return nums[result];
    }
}