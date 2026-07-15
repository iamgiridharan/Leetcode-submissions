class Solution {
    public int gcd(int a, int b){
        if (a==b)
            return a;
        else{
            while(b!=0){
                int temp=b;
                b=a%b;
                a=temp;
            }
            return a;
        }   
    }
    public int gcdOfOddEvenSums(int n) {
        int sumOdd=0;
        int sumEven=0;
        
        for(int i=1; i<n+n; i+=2){
            sumOdd+=i;
        }
        for(int i=2; i<n+n;i+=2){
            sumEven+=i;
        }
        return gcd(sumOdd, sumEven);
    }
}