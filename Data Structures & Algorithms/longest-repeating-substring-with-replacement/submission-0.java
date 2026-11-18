class Solution {
    public int characterReplacement(String s, int k) {
        int L = 0;
        int R = 0;
        int max_count = 0;
        int[] charCounts = new int[26];

        for (R = 0; R < s.length(); R++) {
            charCounts[s.charAt(R) - 'A']++;
            max_count = Math.max(max_count, charCounts[s.charAt(R) - 'A']);
            if(((R-L)+1)-max_count>k){
                charCounts[s.charAt(L) - 'A']--;
                L++;
            }
        }
        return s.length()-L;
    }
}