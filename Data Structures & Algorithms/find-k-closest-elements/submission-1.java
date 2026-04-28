class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int i = 0;
        int j = arr.length - k;
        while( i < j){
            int mid = (i+j)/2;
            if(x - arr[mid] > arr[mid+k] - x){
                i = mid+1;
            }
            else{
                j = mid;
            }
        }
        List<Integer> ans  = new ArrayList<>();
        for(int l = i;l < i+k;l++){
            ans.add(arr[l]);
        }
        return ans;
    }
}