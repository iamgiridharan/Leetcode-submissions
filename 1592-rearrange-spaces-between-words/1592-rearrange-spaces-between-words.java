class Solution {
    public String reorderSpaces(String text) {
        String[] words = text.trim().split("\\s+");
        int w = words.length;
        int space = 0;
        for(char c : text.toCharArray()){
            if (c == ' ') space++;
        }
        if (w == 1)
            return words[0] + " ".repeat(space);
        int gap = w - 1;
        int spaceBetween = space / gap;
        int spaceExtra = space % gap;
        String gapStr = " ".repeat(spaceBetween);   
        StringBuilder result = new StringBuilder();
        for(int i=0; i<w; i++){
            result.append(words[i]);
            if (i<w-1)
                result.append(gapStr);
        }
        result.append(" ".repeat(spaceExtra));
        return result.toString();
    }
}