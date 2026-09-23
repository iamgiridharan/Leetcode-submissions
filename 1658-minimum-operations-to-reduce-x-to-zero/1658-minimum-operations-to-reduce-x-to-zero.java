class Solution {
    public int minOperations(int[] nums, int x) {
        int total = 0;
        int n = nums.length;
        for(int num : nums)
            total+= num;
        int target = total - x;
        if (target < 0) return -1;
        if (target == 0) return n;
        int max_sum = -1;
        int sum = 0;
        int left = 0;
        for(int right = 0; right<n; right++){
            sum+= nums[right];
            while(left<=right && sum > target){
                sum -= nums[left];
                left++;
            }
            if (sum == target){
                max_sum = Math.max(max_sum, right - left + 1);
            }
               
        }
        if (max_sum == -1) 
                return -1;
        else
            return n - max_sum;     
    }
}