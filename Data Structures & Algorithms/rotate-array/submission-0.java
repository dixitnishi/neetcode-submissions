class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;

        int pivot = nums.length-k-1;

        reverse(0,pivot,nums);
        reverse(pivot+1,nums.length-1,nums);
        reverse(0,nums.length-1,nums);
    }

    private void reverse(int i, int j,int[] nums){
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;j--;
        }
    }
}