class Solution:
    def reorderSpaces(self, text: str) -> str:
        words = text.split()
        w = len(words)
        gap = w - 1
        space = 0
        for c in text:
            if c == ' ':
                space += 1 
        if w == 1:
            return words[0] + ' '* space
        
        spaces_between = space // gap
        extra_spaces = space % gap
        gap_str = ' '* spaces_between
        return gap_str.join(words) + ' ' * extra_spaces          
                 
