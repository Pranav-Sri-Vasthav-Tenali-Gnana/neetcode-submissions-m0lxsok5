class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String i : strs){
            char[] charArray = i.toCharArray();
            Arrays.sort(charArray);
            String sortedKey = new String(charArray);
            if (!map.containsKey(sortedKey)) {
                map.put(sortedKey, new ArrayList<>());
            }
            map.get(sortedKey).add(i);
        }
        return new ArrayList<>(map.values());
    }
}