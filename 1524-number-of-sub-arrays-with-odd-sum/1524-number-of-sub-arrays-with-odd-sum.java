class Solution {
    public int numOfSubarrays(int[] arr) {
        int MOD = 1000000007;
        int curr_sum = 0;
        int even_count = 0;
        int odd_count = 0;
        int ans = 0;
        for(int num : arr){
            curr_sum += num;
            if (curr_sum % 2 == 1){
                ans = (ans + 1 + even_count) % MOD;
                odd_count++;
            }
            else{
                ans = (ans + odd_count) % MOD;
                even_count++;
            }
        }
        return ans;
    }
}