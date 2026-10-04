class Solution {
    public boolean checkValidString(String s) {
        int l = 0;
        int h = 0;
        for(char c : s.toCharArray()){
            if (c == '('){
                l++;
                h++;
            }
            if (c == ')'){
                l--;
                h--;
            }
            if (c == '*'){
                l--;
                h++;
            }
            if (l<0) l = 0;
            if (h<0) return false;
        }
        if (l == 0) return true;
        else return false;
    }
}