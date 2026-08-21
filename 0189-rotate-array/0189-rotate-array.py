class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        # n = len(nums)
        # k = k % n
        # def reverse(start: int, end: int):
        #     while start < end:
        #         nums[start], nums[end] = nums[end], nums[start]
        #         start+=1
        #         end-=1
        # reverse(0, n-1)
        # reverse(0, k-1)
        # reverse(k, n-1)  

        n = len(nums)
        k = k % n
        arr1 = []
        arr2 = []
        for i in range(n-k):
            arr1.append(nums[i])
        for i in range(n-k, n):
            arr2.append(nums[i])

        nums[:] = arr2 + arr1