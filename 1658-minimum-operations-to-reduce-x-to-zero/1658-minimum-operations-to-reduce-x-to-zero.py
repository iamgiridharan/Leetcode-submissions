class Solution:
    def minOperations(self, nums: list[int], x: int) -> int:
        n = len(nums)
        total = 0
        for num in nums:
            total+=num
        target = total - x
        if target < 0:
            return -1
        if target == 0:
            return n
        left = 0
        curr_sum = 0
        max_sum = -1
        for right in range(n):
            curr_sum += nums[right]
            while left <= right and curr_sum > target:
                curr_sum -= nums[left]
                left += 1
            if curr_sum == target:
                max_sum = max(max_sum, right - left + 1)   
        if max_sum == -1:
            return -1
        else:
            return n - max_sum                      