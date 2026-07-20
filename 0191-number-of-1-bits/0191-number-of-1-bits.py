class Solution:
    def hammingWeight(self, n: int) -> int:
        count=0
        binary_str=bin(n)
        for i in binary_str:
            if i=='1':
                count+=1
        return count        