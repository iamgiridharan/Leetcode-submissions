class Solution {
    public int missingInteger(int[] nums) {
        int count = nums[0];
        int n = nums.length;
        for(int i=1; i<n; i++){
            if (nums[i] == nums[i-1] + 1){
                count+=nums[i];
            }
            else
                break;
        }
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        while(set.contains(count)){
            count++;
        }
        return count;
    }
}