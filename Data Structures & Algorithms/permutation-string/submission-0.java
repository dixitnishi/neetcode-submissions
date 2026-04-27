class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        int l = 0;
        
        int[] hash1 = new int[26];
        int[] hash2 = new int[26];
        for(int i = 0;i<s1.length();i++){
            hash1[s1.charAt(i) - 'a']++;
            hash2[s2.charAt(i) - 'a']++;
        }
        int count  = 0;

        for(int i = 0;i<26;i++){
            if(hash1[i] == hash2[i]) count++;
        }
        
        for(int r = s1.length();r< s2.length();r++){
            if(count == 26) return true;

            //
            int index  = s2.charAt(r) - 'a';
            hash2[index]++;
            if(hash1[index] == hash2[index]) count++;
            else if(hash1[index] + 1 == hash2[index]) count--;

            index = s2.charAt(l) - 'a';
            hash2[index]--;
            if(hash1[index] == hash2[index]) count++;
            else if(hash1[index]-1 == hash2[index]) count--;
            l++;
        }
        return count == 26;
    }
}
