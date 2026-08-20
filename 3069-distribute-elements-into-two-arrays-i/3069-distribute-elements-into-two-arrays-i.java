class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();

        arr1.add(nums[0]);
        arr2.add(nums[1]);

        for(int i=2; i<nums.length; i++){
            int lastOfarr1 = arr1.get(arr1.size() - 1);
            int lastOfarr2 = arr2.get(arr2.size() - 1);

            if (lastOfarr1 > lastOfarr2){
                arr1.add(nums[i]);
            }
            else
                arr2.add(nums[i]);
        }

        int[] arr = new int[nums.length];

        int index =0;
        for(int num : arr1){
            arr[index] = num;
            index++;
        }
        for(int num : arr2){
            arr[index] = num;
            index++;
        }
        return arr;


    }
}