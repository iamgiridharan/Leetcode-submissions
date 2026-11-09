class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> disappeared = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        for(int i=1; i<nums.length +1; i++){
            if (!set.contains(i)){
                disappeared.add(i);
            }
        }
        return disappeared;
    }
}