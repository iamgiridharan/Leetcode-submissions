class Solution:
    def countMajoritySubarrays(self, nums: List[int], target: int) -> int:
        n=len(nums)
        res=0
        for i in range(n):
            targetc=0
            for j in range(i,n):
                if nums[j]==target:
                    targetc+=1
                else:
                    targetc-=1
                if targetc>0:
                    res+=1    
        return res            
