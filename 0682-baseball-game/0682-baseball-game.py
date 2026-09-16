class Solution:
    def calPoints(self, operations: List[str]) -> int:
        stack = []
        n = len(stack)
        for i in operations:
            if i == 'C':
                stack.pop()
            elif i == 'D':
                stack.append(2 * stack[n-1])    
            elif i== '+':
                stack.append(stack[n-1] + stack[n-2]) 
            else:
                stack.append(int(i))   
        return sum(stack)          

