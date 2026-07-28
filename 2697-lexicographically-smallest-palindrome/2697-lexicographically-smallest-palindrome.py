class Solution:
    def makeSmallestPalindrome(self, s: str) -> str:
        chars = list(s)
        n = len(s)
        left = 0 
        right = n - 1

        while left < right:
            if chars[left] < chars[right]:
                chars[right] = chars[left]
            else:
                chars[left] = chars[right]

            left+=1
            right-=1
            
        return "".join(chars)            