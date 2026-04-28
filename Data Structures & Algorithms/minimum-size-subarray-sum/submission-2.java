class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // Sliding window
        // int minLen = Integer.MAX_VALUE;
        // int l = 0;
        // int r = 0;
        // int sum = 0;
        // while(r < nums.length){
        //     sum += nums[r];
        //     // decreasing case should be when sum >= target
        //     while(sum >= target){
        //         sum-= nums[l];
        //         minLen = Math.min(minLen,r-l+1);
        //         l++;
        //     }
        //     r++;
        // }
        // return minLen == Integer.MAX_VALUE ? 0 : minLen;

        // Prefix Sum + Binary Search approach
        int n = nums.length;
        int [] prefix = new int[n+1];
        for(int i = 0;i<n;i++){
            prefix[i+1] = prefix[i] + nums[i];
        }

        int res = n + 1; // why do we need to do this ?
        for(int i = 0; i< n;i++){
            int l = i,r = n; // How did we decide this range ? isnt n out of bounds ?
            while(l < r){
                int mid = (l+r)/2;
                int currSum = prefix[mid+1] - prefix[i];
                if(currSum >= target){
                    r = mid;
                }
                else{
                    l = mid+1;
                }
            }
            if(l != n){  // why this check
                res = Math.min(l-i+1,res);
            }
        }
        return res % (n+1); // why do we need to do this ?

    }
}