class Solution:
    def missingNumber(self, nums: list[int]) -> int:
        count = 0
        for i in nums:
            count += i
        total = 0
        for i in range(1, len(nums)+1):
            total += i
        ans = total - count
        return ans        