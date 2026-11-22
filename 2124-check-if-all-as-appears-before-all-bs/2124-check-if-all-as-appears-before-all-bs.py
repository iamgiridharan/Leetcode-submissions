class Solution:
    def checkString(self, s: str) -> bool:
        seenB = False
        for w in s:
            if w == "b":
                seenB = True
            if w == "a" and seenB == True:
                return False
        return True            