class Solution:
    def smallestPalindrome(self, s: str) -> str:
        n = len(s)
        mid = n//2

        chars = list(s)

        chars[:mid] = sorted(chars[:mid]) 
        for i in range(mid):
            chars[n-1-i] = chars[i]
        return "".join(chars)   
                