class Solution {
    public int mySqrt(int x) {
        int i = 1;
        int j = x;
        while( i <= j){
            int mid = i + (j-i)/2;
            long temp = (long) mid*mid;
            if(temp == x){
                return mid;
            }
            else if(temp < x){
                i = mid+1;
            }
            else{
                j = mid-1;
            }
        }
        return j;
    }
}