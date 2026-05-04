class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            // Skip duplicate pivots
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int L = i + 1;
            int R = n - 1;

            while (L < R) {
                long sum = (long) nums[i] + nums[L] + nums[R];

                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[L], nums[R]));

                    // Move L and skip duplicates
                    L++;
                    while (L < R && nums[L] == nums[L - 1]) L++;

                    // Move R and skip duplicates
                    R--;
                    while (L < R && nums[R] == nums[R + 1]) R--;
                } else if (sum < 0) {
                    L++;
                } else { // sum > 0
                    R--;
                }
            }
        }

        return res;
    }
}