class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        String binaryStr = Integer.toBinaryString(n);
        for(char c : binaryStr.toCharArray()){
            if (c=='1')
                count++;
        }
        return count;
    }
}