class Solution {
    public int lengthOfLongestSubstring(String s) {

        // Brute force for each substring in n^2 manner
        int ans = 0;
        for(int i = 0;i<s.length();i++){
            Set<Character> charSet = new HashSet<>();
            for(int j = i;j<s.length();j++){
                if(charSet.contains(s.charAt(j))){
                    break;
                }
                charSet.add(s.charAt(j));
            }
            ans = Math.max(ans,charSet.size());
        }
        return ans;
    }
}
