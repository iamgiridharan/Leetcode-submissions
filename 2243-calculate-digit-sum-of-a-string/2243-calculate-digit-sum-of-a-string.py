class Solution:
    def digitSum(self, s: str, k: int) -> str:
        while len(s) > k:
            ans = ""
            for i in range(0,len(s),k):
                word = s[i: i + k]
                sum_ = 0
                for w in word:
                    sum_ += int(w)
                ans += str(sum_) 
            s = ans            
        return s       

            

