class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return 1;

        int minIndex = 0;
        int maxIndex = 0;

        for(int i=1; i<n; i++){
            if (nums[i] < nums[minIndex])
                minIndex = i;
            if (nums[i] > nums[maxIndex])
                maxIndex = i;    
        }

        int first = Math.min(minIndex,maxIndex);
        int last = Math.max(minIndex,maxIndex);

        int bothFromFirst = last + 1;
        int bothFromLast = n - first;
        int oneFromEach = (first + 1) + (n - last);

        return Math.min(bothFromFirst, Math.min(bothFromLast, oneFromEach));


    }
}