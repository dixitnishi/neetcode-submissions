class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l = Integer.MIN_VALUE;
        int r = 0;
        for(int num : weights){
            l = Math.max(l,num);
            r += num;
        }

        while(l<=r){
            int mid = (l+r)/2;
            if(canBeShipped(weights,mid,days)){
                r = mid - 1;
            }
            else{
                l = mid+1;
            }
        }
        return l;
    }

    private boolean canBeShipped(int[] nums,int weight,int days){
        int countDays  = 1;
        int sum = 0;
        for(int num : nums){
            sum+=num;
            if(sum > weight){
                countDays++;
                sum = num;
            }
        }
        return countDays <= days;
    }
}