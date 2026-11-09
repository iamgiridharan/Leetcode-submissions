class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen=new HashSet<>();
        for(int num: nums)
            seen.add(num);
        if (seen.size() == nums.length)
            return false;
        else
            return true;    
    }
}