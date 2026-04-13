class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] conArray = new int[nums.length*2];
        for(int i=0; i<nums.length; i++){
            conArray[i] = nums[i];
            conArray[i+nums.length] = nums[i];
        }

        return conArray;
    }
}