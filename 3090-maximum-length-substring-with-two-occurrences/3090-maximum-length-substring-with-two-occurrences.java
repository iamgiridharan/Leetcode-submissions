class Solution {
    public int maximumLengthSubstring(String s) {
        int hash[] = new int[26];
        int len = 0;
        int max = 0;
        int j = 0;
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (hash[ch-'a']!=2){
                hash[ch-'a']++;
                len++;
                max = Math.max(max,len);
            }
            else{
                while(j<s.length() && s.charAt(j)!= s.charAt(i)){
                    char c1 = s.charAt(j);
                    hash[c1-'a']--;
                    j++;
                    len--;
                }
                j++;
                max = Math.max(max,len);
            }
        }
        max = Math.max(max,len);
        return max;
    }
}