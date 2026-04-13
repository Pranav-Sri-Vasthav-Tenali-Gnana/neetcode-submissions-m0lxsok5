class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int pre_prod = 1;
        for(int i=0; i<nums.length; i++){
            output[i] = pre_prod;
            pre_prod *= nums[i];
        }

        int post_prod = 1;
        for(int i=nums.length-1; i>=0; i--){
            output[i] = output[i] * post_prod;
            post_prod *= nums[i];
        }

        return output;
    }
}