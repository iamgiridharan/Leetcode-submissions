class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder result=new StringBuilder();
        for(String word:words){
            int count=0;
            for(char ch:word.toCharArray()){
                count+=weights[ch - 'a'];
            }
            int mod=count % weights.length;
            char mappedChar=(char) ('z'-mod);
            result.append(mappedChar);
        }
        return result.toString();
        
    }
}