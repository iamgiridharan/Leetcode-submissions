class Solution:
    def smallerNumbersThanCurrent(self, nums: list[int]) -> list[int]:
        temp = sorted(nums)
        numbers = {}
        for i, num in enumerate(temp):
            if num not in numbers:
                numbers[num] = i
        newarr = []
        for i in nums:
            newarr.append(numbers[i])
        return newarr           
