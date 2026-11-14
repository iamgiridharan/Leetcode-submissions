class Solution:
    def minimumSumSubarray(self, nums: List[int], l: int, r: int) -> int:
        ans = float("inf")
        n = len(nums)
        for i in range(n):
            sum_ = 0
            for j in range(i,n):
                sum_ += nums[j]
                length = j - i + 1
                if length >= l and length <= r and sum_ > 0: 
                    ans = min(ans, sum_)
        if ans == float("inf"):
            return -1
        else:
            return ans                
