class Solution {
    public int smallestNumber(int n, int t) {
        int product = 1;
        int temp = n;
        while (temp > 0){
            int digit = temp % 10;
            product *= digit;
            temp = temp/10;
        }
        
        if (product % t == 0){
            return n;
        }
        else{
            return smallestNumber(n+1 , t);
        }
    }
}