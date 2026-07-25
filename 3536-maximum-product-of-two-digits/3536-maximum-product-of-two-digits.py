class Solution:
    def maxProduct(self, n: int) -> int:
        if n==0:
            return 0
        max_digit = 0
        global_max = 0    
        while n>0:
            digit = n % 10
            global_max = max(global_max, max_digit * digit)
            max_digit = max(max_digit, digit)
            n//=10
        return global_max    
