class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int a = nums[0];
        int b = nums[n-1];
        ArrayList<Integer> arr = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
            
        }
        for(int i=a; i<b; i++){
            if (!set.contains(i)){
                arr.add(i);
            }    
        }
        return arr;
    }
}