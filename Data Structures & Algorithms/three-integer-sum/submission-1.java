class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> answer = new ArrayList<>();

        for (int pivot = 0; pivot < nums.length - 2; pivot++) {
            if (pivot > 0 && nums[pivot] == nums[pivot - 1]) continue;

            int left = pivot + 1;
            int right = nums.length - 1;

            while (left < right) {
                long sum = (long) nums[pivot] + nums[left] + nums[right];

                if (sum == 0) {
                    answer.add(Arrays.asList(nums[pivot], nums[left], nums[right]));

                    left++;
                    right--;

                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;

                } else if (sum > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return answer;
    }
}