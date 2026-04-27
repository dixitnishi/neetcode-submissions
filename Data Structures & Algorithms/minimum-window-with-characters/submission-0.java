class Solution {
    public String minWindow(String s, String t) {
        int minLen = Integer.MAX_VALUE;
        int l = 0;
        int count = 0;
        int hash[] = new int[256];
        for(char ch : t.toCharArray()){
            hash[ch]++;
        }
        int sIdx = -1;
        for(int r = 0; r < s.length(); r++){
            if(hash[s.charAt(r)] > 0) count++;
            hash[s.charAt(r)]--;
            while(count == t.length()){
                if((r-l+1) < minLen){
                    minLen = r-l+1;
                    sIdx = l;
                }
                hash[s.charAt(l)]++;
                if(hash[s.charAt(l)] > 0) count--;
                l++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "": s.substring(sIdx,sIdx+minLen);
    }
}
