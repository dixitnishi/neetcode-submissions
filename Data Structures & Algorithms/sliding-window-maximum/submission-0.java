class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        // Brute force appraoch
        List<Integer> temp = new ArrayList<>();
        int n = nums.length - k + 1;
        for(int i = 0;i<n;i++){
            int max = Integer.MIN_VALUE;
            int idx = i;
            for(int j = 0;j<k;j++){
                max = Math.max(nums[idx++],max);
            }
            temp.add(max);
        }
        int ans[] = new int[temp.size()];
        for(int i = 0;i < ans.length; i++){
            ans[i] = temp.get(i);
        }
        return ans;

        //
    }
}
