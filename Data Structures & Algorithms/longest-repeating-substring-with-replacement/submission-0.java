class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        int res = 0;
        int l = 0,maxf= 0 ;
        for(int r = 0;r<s.length();r++){
            char curr = s.charAt(r);
            map.put(curr, map.getOrDefault(curr,0)+1);
            maxf = Math.max(maxf,map.get(curr));
            
            while((r-l+1) - maxf > k){
                char currL = s.charAt(l);
                map.put(currL,map.get(currL)-1);
                l++;
            }

            res = Math.max(res,(r-l+1));
        }
        return res;
    }
}
