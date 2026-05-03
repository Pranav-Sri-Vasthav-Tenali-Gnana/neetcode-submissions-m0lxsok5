class Solution {
    public int findMin(int[] nums) {
        int L = 0, R = nums.length-1;
        while(L<R){
            int mid = (L+(R-L)/2);
            if (nums[mid] > nums[R]){
                L = mid+1;
            } else if (nums[mid]<= nums[R]){
                R = mid;
            }
        }
        return nums[R];
    }
}
