class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] temp = Arrays.stream(nums).sorted().toArray();
        HashMap<Integer, Integer> numbers = new HashMap<>();
        for(int i=0; i<temp.length; i++){
            if (!numbers.containsKey(temp[i])){
                numbers.put(temp[i], i);
            }
        }
        int[] newArr = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            newArr[i] = numbers.get(nums[i]);
        }
        return newArr;
        
    }
}