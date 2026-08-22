class Solution {
    public boolean checkDivisibility(int n) {
        int originalN = n;
        int prod = 1;
        int sum = 0;
        while (n > 0){
            int digit = n % 10;
            prod = prod * digit;
            sum = sum + digit;
            n = n/10;
        }

        return originalN % (sum + prod)==0;
    }
}