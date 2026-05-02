class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> freq = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();
        for (int i = 0; i<s1.length(); i++){
            freq.put(s1.charAt(i), freq.getOrDefault(s1.charAt(i), 0)+1);
        }

        for(int i = 0; i < s2.length(); i++){
            window.put(s2.charAt(i), window.getOrDefault(s2.charAt(i), 0)+1);

            if(i >= s1.length()){
                char leftChar = s2.charAt(i - s1.length());
                window.put(leftChar, window.get(leftChar) - 1);
                if(window.get(leftChar) == 0) window.remove(leftChar);
            }

            if(window.equals(freq)) return true;
        }
        return false;

    }
}