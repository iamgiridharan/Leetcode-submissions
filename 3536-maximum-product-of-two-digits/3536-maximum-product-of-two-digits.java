class Solution {
    public int maxProduct(int n) {
        if (n==0) return 0;
        int maxDigit = 1;
        int globalMax = 1;
        
        while (n > 0){
            int digit = n%10;
            globalMax = Math.max(globalMax, maxDigit*digit);
            maxDigit = Math.max(maxDigit,digit);
            
            n = n/10;
        }
        return globalMax;
    }
}