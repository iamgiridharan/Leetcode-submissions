class Solution:
    def generateParenthesis(self, n: int) -> list[str]:
        result = []
        def backtrack(current, open_c, close_c):
            if len(current) == 2 * n:
                result.append(current)
                return 
            if open_c < n:
                backtrack(current + "(", open_c + 1, close_c)
            if close_c < open_c:
                backtrack(current + ")", open_c, close_c + 1)
        backtrack("", 0, 0)
        return result          