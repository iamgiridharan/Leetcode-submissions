class Solution:
    def findMissingElements(self, nums: List[int]) -> List[int]:
        a = min(nums)
        b = max(nums)
        
        missing = []
        
        for i in range(a,b+1):
            if i not in set(nums):
                missing.append(i)
        return missing        

