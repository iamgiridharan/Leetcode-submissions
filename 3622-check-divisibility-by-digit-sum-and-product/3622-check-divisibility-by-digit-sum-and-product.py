class Solution:
    def checkDivisibility(self, n: int) -> bool:
        originalN = n
        sum_ = 0
        prod_ = 1
        while n > 0:
            digit = n % 10
            sum_+=digit
            prod_*=digit
            n = n//10

        return originalN % (sum_ + prod_) ==0    

        