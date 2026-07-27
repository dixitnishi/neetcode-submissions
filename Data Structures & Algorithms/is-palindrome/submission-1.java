class Solution {
    public boolean isPalindrome(String s) {
        String updated = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int i = 0;
        int j = updated.length() - 1;
        while(i <= j){
            if(updated.charAt(i) != updated.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
        
    }
}
