class Solution {
    public int missingNumber(int[] nums) {
        int count = 0;
        for(int n : nums)
            count += n;
        int total = 0;
        for(int i = 1; i <= nums.length; i++){
            total += i;
        }    
        int ans = total - count;
        return ans;
    }
}