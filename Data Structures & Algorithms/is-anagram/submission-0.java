class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sHash = new HashMap<>();
        HashMap<Character, Integer> tHash = new HashMap<>();
        int sLen = s.length();
        int tLen = t.length();
        if (sLen != tLen){
            return false;
        }

        for(int i = 0; i<sLen; i++){
            char sString = s.charAt(i);
            if (sHash.containsKey(sString)){
                sHash.put(sString, sHash.get(sString)+1);
            } else {
                sHash.put(sString, 1);
            }
        }

        for(int i = 0; i<tLen; i++){
            char tString = t.charAt(i);
            if (tHash.containsKey(tString)){
                tHash.put(tString, tHash.get(tString)+1);
            } else {
                tHash.put(tString, 1);
            }
        }

        if (sHash.equals(tHash)){
            return true;
        } else {
            return false;
        }

    }
}