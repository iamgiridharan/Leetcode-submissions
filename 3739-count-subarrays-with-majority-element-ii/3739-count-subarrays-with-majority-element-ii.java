class Solution {
    public long countMajoritySubarrays(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        long validleftPoints=0;
        int cumSum=0;
        long res=0;

        map.put(0,1);

        for(int i=0;i<nums.length;i++){
            if (nums[i]==target){
                validleftPoints+=map.getOrDefault(cumSum,0);
                cumSum++;
            }
            else{
                cumSum--;
                validleftPoints-=map.getOrDefault(cumSum,0);
            }
            map.put(cumSum, map.getOrDefault(cumSum,0) + 1);
            res+=validleftPoints;
        }
        return res;
    }
}