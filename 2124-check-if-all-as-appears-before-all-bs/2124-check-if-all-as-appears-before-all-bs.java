class Solution {
    public boolean checkString(String s) {
        boolean seenB = false;
        for(char ch : s.toCharArray()){
            if (ch == 'b') seenB = true;
            if (ch == 'a' && seenB == true) return false;
        }
        return true;
    }
}