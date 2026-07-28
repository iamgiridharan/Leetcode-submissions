class Solution:
    def smallestPalindrome(self, s: str) -> str:
        s1_list = []
        s2_list = []

        for i in range(len(s)//2):
            s1_list.append(s[i])
        s1_list.sort()    
        s1 = "".join(s1_list)  

        for i in range((len(s) + 1)//2, len(s)):
            s2_list.append(s[i])
        s2_list.sort(reverse = True)    
        s2 = "".join(s2_list)

        mid = ""
        if len(s) % 2!=0:
            mid += s[len(s)//2]

        return s1 + mid + s2    
                