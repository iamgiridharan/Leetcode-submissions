class Solution:
    def checkValidString(self, s: str) -> bool:
        count1 = 0
        count2 = 0
        for c in s:
            if c == "(":
                count1+=1
                count2+=1
            if c == ")":
                count2-=1
                count1-=1
            if c == "*":   
                count1-=1
                count2+=1 
            if count1<0:
                count1=0
            if count2<0:
                return False        
        if count1 == 0:
            return True
        else:
            return False               
        