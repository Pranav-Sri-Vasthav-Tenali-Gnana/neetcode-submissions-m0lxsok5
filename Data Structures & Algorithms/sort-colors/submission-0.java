class Solution {

    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void sortColors(int[] nums) {
        int L = 0;
        int R = nums.length-1;
        int i = 0;

        while (i<=R){
            if (nums[i] == 0){
                swap(nums, L, i);
                L += 1;
            } else if (nums[i]==2){
                swap(nums, i, R);
                R-=1;
                i-=1;
            }
            i+=1;
        }
    }
}