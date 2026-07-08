class Solution {
    public String lastSubstring(String s) {
        int i=0;
        int j=1;
        int k=0;
        int n=s.length();
        while(j+k<n){
            char charI=s.charAt(i+k);
            char charJ=s.charAt(j+k);

            if (charI==charJ)
                k++;
            else if(charI<charJ){
                i=Math.max(i+k+1,j);
                j=i+1;
                k=0;
            }    
            else{
                j=j+k+1;
                k=0;
            }
        }
        return s.substring(i);
    }
}