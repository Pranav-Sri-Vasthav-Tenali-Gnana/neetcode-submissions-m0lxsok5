class Solution {
    public String longestCommonPrefix(String[] strs) {
        String LCP = strs[0];
        for (int i = 1; i<strs.length; i++){
             while(!strs[i].startsWith(LCP)){
                LCP = LCP.substring(0, LCP.length()-1);
                if(LCP.isEmpty()) return "";
            }
        }
        return LCP;
    }
}