class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> counts = new HashMap<>();

        for(int num : nums){
            counts.put(num,counts.getOrDefault(num,0)+1);
        }

        List<Integer> sortedNums = new ArrayList<>(counts.keySet());
        
        sortedNums.sort((a,b) -> counts.get(b) - counts.get(a));

        int[] result = new int[k];
        for(int i=0; i<k; i++){
            result[i] = sortedNums.get(i);
        }
        return result;
        
    }
}