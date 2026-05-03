class Solution {
    public int search(int[] nums, int target) {
        int L = 0, R = nums.length-1;
        while(L<R){
            int mid = (L+(R-L)/2);
            if (nums[L]<= nums[mid]){
                if(target >= nums[L] && target <= nums[mid]){
                    R = mid;
                } else {
                    L = mid + 1;
                }
            } else {
                if(target >= nums[mid] && target <= nums[R]){
                    L = mid;
                } else {
                    R = mid - 1;
                }
            }
        }
        return nums[L] == target ? L : -1;
    }
}