class Solution:
    def smallestIndex(self, nums: List[int]) -> int:
        def sod(n):
            total = 0
            while n > 0:
                total+= n%10
                n//=10
            return total      
        for i,val in enumerate(nums):
            if sod(val) == i:
                return i
        return -1             
                

