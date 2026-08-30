class Solution:
    def minimumDeletions(self, nums: List[int]) -> int:
        n = len(nums)
        if n==1:
            return 1
        minIndex = 0
        maxIndex = 0

        for i in range(n):
            if nums[i] < nums[minIndex]:
                minIndex = i
            if nums[i] > nums[maxIndex]:
                maxIndex = i

        first = min(minIndex,maxIndex)
        last = max(minIndex,maxIndex)

        bothFromFront = last + 1
        bothFromBack = n - first

        oneFromEachSide = (first + 1) + (n - last) 

        return min(bothFromFront, min(bothFromBack, oneFromEachSide))           