class Solution {
    public int numberOfSubstrings(String s) {
        int[] last_seen= {-1,-1,-1};
        int count=0;
        for(int i=0;i<s.length();i++){
            last_seen[s.charAt(i)-'a']=i;
            int minIndex=Math.min(last_seen[0],Math.min(last_seen[1],last_seen[2]));
            count+=minIndex+1;
        }
        return count;


    }
}