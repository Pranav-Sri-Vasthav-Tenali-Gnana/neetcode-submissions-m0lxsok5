class Solution {
    public int removeElement(int[] nums, int val) {
        int L = 0;
        int R = nums.length-1;
        int count = 0;
        while(L<=R) {
            if (nums[R] == val) {
                R-=1;
                count+=1;
            } else if (nums[L] == val){
                int temp = nums[L];
                nums[L] = nums[R];
                nums[R] = temp;
                L+=1;
            } else {
                L+=1;
            }
        }
        return nums.length - count;
    }
}