class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer,Integer> prefix_map=new HashMap<>();
        prefix_map.put(0,1);
        int curr_sum=0;
        int total_subarr=0;
        for(int num : nums){
            curr_sum+=num;
            int target_sum=curr_sum-k;
            if (prefix_map.containsKey(target_sum)){
                total_subarr+=prefix_map.get(target_sum);
            }
            prefix_map.put(curr_sum, prefix_map.getOrDefault(curr_sum,0)+1);
           
        }
        return total_subarr;
    }
}