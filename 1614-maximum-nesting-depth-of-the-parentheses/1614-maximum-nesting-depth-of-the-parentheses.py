class Solution:
    def maxDepth(self, s: str) -> int:
        count = 0
        maxi = 0
        for c in s:
            if c=='(':
                count+=1
                maxi = max(maxi, count)
            elif c==')':
                count-=1
        return maxi            
