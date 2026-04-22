class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int i = 0;
        int j = n-1;
        int maxWater = -1;
        while(i<j){
            maxWater = Math.max((j-i) * Math.min(heights[i],heights[j]),maxWater);
            if(heights[i] < heights[j]){
                i++;
            }
            else j--;
        }
        return maxWater;
    }
}
