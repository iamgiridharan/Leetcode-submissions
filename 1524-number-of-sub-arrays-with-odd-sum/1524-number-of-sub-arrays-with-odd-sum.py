class Solution:
    def numOfSubarrays(self, arr: list[int]) -> int:
        MOD = 10**9 + 7
        ans = 0
        curr_sum = 0
        even_count = 0
        odd_count = 0
        for num in arr:
            curr_sum += num
            if curr_sum % 2 == 1:
                ans = (ans + 1 + even_count) % MOD
                odd_count +=1
            else:
                ans = (ans + odd_count) % MOD
                even_count += 1    

        return ans            