class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        // int row = -1;
        // int i = 0;
        // int j = rows -1;
        // while(i <= j){
        //     int mid = (i+j)/2;
        //     if(matrix[mid][cols-1] < target) i = mid+1;
        //     else if(matrix[mid][0] > target) j = mid-1;
        //     else {row = mid;break;}
        // } 
        // if( row == -1) return false;
        // i = 0;
        // j = cols-1;
        // while(i <= j){
        //     int mid = (i + j) / 2;
        //     if(matrix[row][mid] == target) return true;
        //     else if(matrix[row][mid] < target) i = mid+1;
        //     else j = mid-1;
        // }
        // return false;


        int i = 0;
        int j = rows*cols - 1;
        while( i <= j){
            int mid = (i+j) / 2;
            int row = mid / cols;
            int col = mid%cols;
            if(matrix[row][col]  == target) return true;
            else if(matrix[row][col] < target) i = mid + 1;
            else j = mid - 1; 
        }
        return false;
    }
}
