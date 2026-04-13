class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> minus = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            if (minus.containsKey(nums[i])){
                return new int[] {minus.get(nums[i]), i};
            }
            minus.put(target - nums[i], i);
        }
        return new int[] {-1, -1};
    }
}