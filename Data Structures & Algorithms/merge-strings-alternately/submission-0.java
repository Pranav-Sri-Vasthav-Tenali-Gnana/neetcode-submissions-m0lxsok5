class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int minlength = Math.min(len1, len2);
        StringBuilder sb1 = new StringBuilder();
        for (int i=0; i<minlength; i++){
            sb1.append(word1.charAt(i));
            sb1.append(word2.charAt(i));
        }
        if (len1>len2){
            sb1.append(word1.substring(minlength));
        } else {
            sb1.append(word2.substring(minlength));
        }
        String result = sb1.toString();
        return result;
    }
}