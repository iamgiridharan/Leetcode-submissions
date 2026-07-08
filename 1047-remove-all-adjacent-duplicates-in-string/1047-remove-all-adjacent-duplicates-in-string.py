class Solution:
    def removeDuplicates(self, s: str) -> str:
        stack=[]
        for cur in s:
            if stack and stack[-1]==cur:
                stack.pop()
            else:
                stack.append(cur)
        return "".join(stack)      