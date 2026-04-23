class Solution {
    public int trap(int[] heights) {
        int n = heights.length;
        if(n == 0) return 0;

        int leftmax[] = new int[n];
        int rightmax[] = new int[n];
        
        leftmax[0] = heights[0];
        rightmax[n-1] = heights[n-1];
        for(int i = 1;i<leftmax.length;i++){
            leftmax[i] = Math.max(leftmax[i-1],heights[i]);
        }

        for( int i = n-2;i>=0;i--){
            rightmax[i] = Math.max(rightmax[i+1],heights[i]);
        }

        int res = 0;
        for(int i = 0;i<heights.length;i++){
            res+= Math.min(leftmax[i],rightmax[i]) - heights[i];
        }
        return res;
    }
}
