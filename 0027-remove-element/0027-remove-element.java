class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int[] result=new int[n];
        int count=0;
        for(int i : nums){
            if (val!=i){
                result[count]=i;
                count++;
            }
        }
        for(int i=0;i<count;i++){
            nums[i]=result[i];
        }
        return count;
    }
}