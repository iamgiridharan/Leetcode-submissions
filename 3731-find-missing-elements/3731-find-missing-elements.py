class Solution:
    def findMissingElements(self, nums: List[int]) -> List[int]:
        n = len(nums)
        nums.sort()
        a = nums[0]
        b = nums[n-1]
        
        missing = []
        
        for i in range(a,b+1):
            if i not in set(nums):
                missing.append(i)
        return missing        

