class Solution {
    public int splitArray(int[] nums, int k) {
        int low = Integer.MIN_VALUE;
        int high = 0;
        for(int num : nums){
            low = Math.max(low,num);
            high += num;
        }
        int res = high;

        while(low <= high){
            int mid  = (low + high)/2;
            if(canSplit(nums,k,mid)){
                res = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return res;
    }

    private boolean canSplit(int nums[],int k,int limit){
        int sum = 0;
        int arrays = 1;
        for(int num : nums){
            sum += num;
            if(sum > limit){
                arrays++;
                if(arrays > k) return false;
                sum = num;
            }
        }
        return true;
    }

}