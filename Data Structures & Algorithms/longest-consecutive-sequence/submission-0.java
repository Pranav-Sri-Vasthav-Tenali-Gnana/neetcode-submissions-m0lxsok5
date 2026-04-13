class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i: nums){
            set.add(i);
        }
        int length = 0;
        for(int num : set){
            int count = 1;
            if(!set.contains(num - 1)){
                while(set.contains(num+1)){
                    count+=1;
                    num++;
                }
                length = Math.max(length, count);
            }
        }
        return length;
    }
}