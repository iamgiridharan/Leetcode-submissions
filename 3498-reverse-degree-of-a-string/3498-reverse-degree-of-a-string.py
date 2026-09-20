class Solution:
    def reverseDegree(self, s: str) -> int:
        degree = 0
        for i in range(len(s)):
            degree += (26 - (ord(s[i]) - ord('a'))) * (i+1)
        return degree    

