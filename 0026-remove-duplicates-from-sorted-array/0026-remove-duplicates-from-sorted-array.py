class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        seen=[]
        result=[]
        for i in nums:
            if i not in seen:
                result.append(i) 
                seen.append(i)
        for i in range(len(result)):
            nums[i]=result[i]

        return len(result) 


