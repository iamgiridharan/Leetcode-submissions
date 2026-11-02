class Solution:
    def minMoves2(self, nums: list[int]) -> int:
        nums.sort()
        mid = nums[len(nums)//2]
        moves = 0
        for i in nums:
            moves += abs(i - mid)
                
        return moves 