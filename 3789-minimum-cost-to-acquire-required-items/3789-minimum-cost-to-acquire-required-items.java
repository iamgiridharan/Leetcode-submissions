class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long c1 = cost1, c2 = cost2, n1 = need1, n2 = need2, cb = costBoth; 
        long option1 = n1 * c1 + n2 * c2;
        long common = Math.min(n1, n2);
        long option2 = cb * common + c1 * (n1 - common) + c2 * (n2 - common);
        long option3 = cb * Math.max(n1, n2);
        return Math.min(option1, Math.min(option2, option3));
    }
}