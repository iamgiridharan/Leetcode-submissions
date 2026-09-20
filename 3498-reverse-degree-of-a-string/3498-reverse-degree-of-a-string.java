class Solution {
    public int reverseDegree(String s) {
        int n = s.length();
        int degree = 0;
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            degree += (26 - (ch - 'a')) * (i+1);
        }
        return degree;

    }
}