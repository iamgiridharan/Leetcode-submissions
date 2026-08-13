class NumArray {
    private int[] prefix;
    public NumArray(int[] nums) {
        prefix = new int[nums.length];
        int count = 0;
        for(int i=0; i<nums.length; i++){
            count += nums[i];
            prefix[i] = count;
        }
    }
    
    public int sumRange(int left, int right) {
        int leftSum = 0;
        if (left > 0){
            leftSum += prefix[left-1];
        }
        int rightSum = prefix[right];
        return rightSum - leftSum;

    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */