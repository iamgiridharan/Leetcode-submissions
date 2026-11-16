class Solution {
    public String digitSum(String s, int k) {
        while (s.length() > k){
            String ans = "";
            for(int i=0; i<s.length(); i+=k){
                String word = s.substring(i, Math.min(i+k, s.length()));
                int sum = 0;
                for(char w : word.toCharArray())
                    sum += Integer.parseInt(String.valueOf(w));
                ans += Integer.toString(sum);    
            }
            s = ans;
        }
        return s;
    }
}