class Solution {
    public boolean hasDuplicate(int[] nums) {
        int len = nums.length;
        HashSet<Integer> numsSet = new HashSet<>();
        for(int i=0;i<len; i++){
            numsSet.add(nums[i]);
        }

        if (len > numsSet.size()){
            return true;
        } else {
            return false;
        }
    }
}