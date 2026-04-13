class Solution {
    public boolean validPalindrome(String s) {
        int L = 0;
        int R = s.length()-1;
        int count = 0;
        while(L <= R){
            if(s.charAt(L) == s.charAt(R)){
                L++; R--;
            } else {
                return isPalindrome(s, L+1, R) || isPalindrome(s, L, R-1);
            }
        }
        return true;
    }

    public boolean isPalindrome(String s, int L, int R){
        while(L <= R){
            if(s.charAt(L) != s.charAt(R)) return false;
            L++;
            R--;
        }
        return true;
    }
}