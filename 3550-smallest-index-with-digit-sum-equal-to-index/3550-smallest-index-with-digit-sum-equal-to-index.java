class Solution {
    public int sod(int n){
        int total = 0;
        while (n > 0){
            total += n % 10;
            n /= 10;
        }
        return total;
    }
    public int smallestIndex(int[] nums) {
        for(int i=0; i<nums.length; i++){
            if (sod(nums[i]) == i)
                return i;
        }
        return -1;
    }
}