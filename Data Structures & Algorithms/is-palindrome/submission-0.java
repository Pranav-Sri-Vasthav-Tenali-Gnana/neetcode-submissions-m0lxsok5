class Solution {
    public boolean isPalindrome(String s) {
        String cleanString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int L = 0;
        int R = cleanString.length()-1;
        while(L<=R){
            if (cleanString.charAt(L)==cleanString.charAt(R)){
                L++;
                R--;
            } else {
                return false;
            }
        }
        return true;
    }
}