class Solution {
    public int lengthOfLongestSubstring(String s) {

        // Brute force for each substring in n^2 manner
        // int ans = 0;
        // for(int i = 0;i<s.length();i++){
        //     Set<Character> charSet = new HashSet<>();
        //     for(int j = i;j<s.length();j++){
        //         if(charSet.contains(s.charAt(j))){
        //             break;
        //         }
        //         charSet.add(s.charAt(j));
        //     }
        //     ans = Math.max(ans,charSet.size());
        // }
        // return ans;

        // Sliding window method
        // int left = 0;
        // Set<Character> charSet = new HashSet<>();
        // int ans = 0;
        // for(int r = 0;r<s.length();r++){
        //     while(charSet.contains(s.charAt(r))){
        //         charSet.remove(s.charAt(left));
        //         left++;
        //     }
        //     charSet.add(s.charAt(r));
        //     ans = Math.max(ans,r-left+1);
        // }
        // return ans;

        // Sliding window more optimal
        int ans  = 0;
        Map<Character,Integer> lastIndex = new HashMap<>();
        int l = 0;
        for(int r = 0;r < s.length();r++){
            if(lastIndex.containsKey(s.charAt(r))){
                l = Math.max(lastIndex.get(s.charAt(r))+1,l);

            }
            lastIndex.put(s.charAt(r),r);
            ans = Math.max(ans,r-l+1);
        }
        return ans;
    }
}
