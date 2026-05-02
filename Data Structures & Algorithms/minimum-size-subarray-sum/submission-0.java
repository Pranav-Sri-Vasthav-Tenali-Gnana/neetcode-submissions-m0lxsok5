class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int L = 0;
        int cur_sum = 0;
        int min_length = Integer.MAX_VALUE;
        for (int R = 0; R<nums.length; R++){
            cur_sum += nums[R];
            while(cur_sum >= target){
                min_length = Math.min(min_length, R-L+1);
                cur_sum -= nums[L];
                L++;
            }
        }
        return min_length == Integer.MAX_VALUE ? 0 : min_length;
    }
}