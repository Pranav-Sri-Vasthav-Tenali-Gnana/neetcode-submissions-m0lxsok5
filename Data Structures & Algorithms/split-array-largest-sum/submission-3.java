class Solution {
    public int splitArray(int[] nums, int k) {
        int L = nums[0];
        int R = 0;
        for (int i : nums) {
            L = Math.max(L, i);
            R += i;
        }

        int res = 0;
        while(L<=R){
            int mid = L + ((R-L)/2);
            if (canSplit(nums, mid, k)){
                res = mid;
                R = mid - 1;
            } else {
                L = mid + 1;
            }
        }
        return res;
    }

    public boolean canSplit(int[] nums, int largest, int k){
            int subarray = 0;
            int cursum = 0;

            for(int n : nums){
                cursum += n;
                if (cursum > largest){
                    subarray += 1;
                    cursum = n;
                }
            }
            return subarray + 1 <= k;
        }
}