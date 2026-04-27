class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;
        int l = 0;
        int r = 0;
        int sum = 0;
        while(r < nums.length){
            sum += nums[r];
            // decreasing case should be when sum >= target
            while(sum >= target){
                sum-= nums[l];
                minLen = Math.min(minLen,r-l+1);
                l++;
            }
            r++;
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}