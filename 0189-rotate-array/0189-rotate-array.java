class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        int[] arr1 = new int[k];
        int[] arr2 = new int[n-k];

        for(int i=0; i<n-k; i++){
            arr2[i]=nums[i];
        }
        for(int i=n-k; i<n; i++){
            arr1[i-(n-k)]=nums[i];
        }

        System.arraycopy(arr1, 0, nums, 0, arr1.length);
        System.arraycopy(arr2, 0, nums, arr1.length, arr2.length);





    }
}