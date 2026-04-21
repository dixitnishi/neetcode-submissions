class Solution {
    public boolean isPalindrome(String s) {
        String withoutSpecialChars = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int i = 0;
        int j = withoutSpecialChars.length()-1;
        return helper(i,j,withoutSpecialChars);
    }

    private boolean helper(int i,int j,String s){
        if( i> j) return true;
        if(s.charAt(i) != s.charAt(j)) return false;
        return  helper(i+1,j-1,s);
    }
}
