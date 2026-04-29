class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        // Brute force appraoch
        // List<Integer> temp = new ArrayList<>();
        // int n = nums.length - k + 1;
        // for(int i = 0;i<n;i++){
        //     int max = Integer.MIN_VALUE;
        //     int idx = i;
        //     for(int j = 0;j<k;j++){
        //         max = Math.max(nums[idx++],max);
        //     }
        //     temp.add(max);
        // }
        // int ans[] = new int[temp.size()];
        // for(int i = 0;i < ans.length; i++){
        //     ans[i] = temp.get(i);
        // }
        // return ans;

        // dynamic programming approach
        int n = nums.length;
        int []leftmax = new int[n];
        int []rightmax = new int[n];
        leftmax[0] = nums[0];
        rightmax[n-1] = nums[n-1];

        for(int i = 1;i<n;i++){
            if(i % k == 0){
                leftmax[i] = nums[i];
            }
            else{
                leftmax[i] = Math.max(leftmax[i-1],nums[i]);
            }

            if((n-1-i) % k == 0){
                rightmax[n-i-1] = nums[n-i-1];
            }else{
                rightmax[n-i-1] = Math.max(rightmax[n-i],nums[n-i-1]);
            }
        }

        int[] output = new int[n-k+1];
        for(int i = 0;i<n-k+1;i++){
            // we are taking i+k-1 since we are looking at the start and end of the window
            //start of the window to be picked from the rightmax array
            // and end of the window to be picked from leftmax array
            output[i] = Math.max(leftmax[i+k-1],rightmax[i]);
        }
        return output;
    }
}
