class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;

        int res = 0;

        while(l < r){
            int area = (r - l) * Math.min(height[l],height[r]);

            if(height[l] < height[r])
                l++;
            else
                r--;    
            res = Math.max(res,area);    
        }
        return res;
    }
}