class Solution:
    def minMoves(self, nums: List[int]) -> int:
        maxi = 0
        for num in nums:
            maxi = max(num, maxi)
        moves = 0
        for num in nums:
            moves += abs(num - maxi) 
        return moves       