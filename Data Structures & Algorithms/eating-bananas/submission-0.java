class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 0;
        int r = Integer.MIN_VALUE;
        for(int num : piles){
            r = Math.max(r, num);
        }

        while( l <= r ){
            int mid = (l+r)/2;
            if(canEatBananas(piles,mid,h)){
                r = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return l;
    }

    private boolean canEatBananas(int[] piles,int k,int h){
        int count = 0;
        for(int num : piles){
            count += Math.ceil((double) num / (double) k);
        }
        return count <= h;
    }
}
